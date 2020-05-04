package com.example.restService.services;

import com.example.restService.models.WeatherData;

public interface WeatherDataService {

    WeatherData getWeatherData(String name);
    void saveWeatherData(WeatherData weatherData);
}
