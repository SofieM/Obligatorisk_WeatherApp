package com.example.restService.services;

import com.example.restService.RestServiceApplication;
import com.example.restService.models.WeatherData;
import com.example.restService.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    WeatherDataRepository weatherDataRepository;
    @Autowired
    CloudsRepository cloudsRepository;
    @Autowired
    CoordRepository coordRepository;
    @Autowired
    MainRepository mainRepository;
    @Autowired
    SysRepository sysRepository;
    @Autowired
    WindRepository windRepository;

    private static final Logger log = LoggerFactory.getLogger(RestServiceApplication.class);
    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherData getWeatherData(String name) {
        WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+name+"&units=metric&appid=ce54c5c9c45455a666e135f9c90f31ee", WeatherData.class);
        log.info(weatherData.toString());
        return weatherData;
    }

    public void saveWeatherData(WeatherData weatherData){
        cloudsRepository.save(weatherData.getClouds());
        coordRepository.save(weatherData.getCoord());
        mainRepository.save(weatherData.getMain());
        sysRepository.save(weatherData.getSys());
        windRepository.save(weatherData.getWind());
        weatherDataRepository.save(weatherData);
    }
}
