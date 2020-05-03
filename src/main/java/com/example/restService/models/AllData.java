package com.example.restService.models;

import java.util.List;

public class AllData {

    List<WeatherData> restService;

    public List<WeatherData> getRestService() {
        return restService;
    }

    public void setRestService(List<WeatherData> restService) {
        this.restService = restService;
    }
}
