package com.example.restService.services;

import com.example.restService.RestServiceApplication;
import com.example.restService.models.WeatherData;
import com.example.restService.repositories.WeatherDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    WeatherDataRepository weatherDataRepository;

    private static final Logger log = LoggerFactory.getLogger(RestServiceApplication.class);
    private RestTemplate restTemplate;

    public WeatherDataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherData getWeatherData(String name) {
        WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+name+"&units=metric&appid=ce54c5c9c45455a666e135f9c90f31ee", WeatherData.class);
        log.info(weatherData.toString());
        return weatherData;
    }

    public void saveWeatherData(WeatherData weatherData){

        weatherDataRepository.save(weatherData);
    }
}
