package com.example.restService.controllers;

import com.example.restService.models.Weather;
import com.example.restService.models.WeatherData;
import com.example.restService.services.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Controller
public class HomeController {

    @Autowired
    WeatherDataService weatherDataService;

    @GetMapping("/")
    public String index(Model model){

        return "index";
    }

    @GetMapping("weatherData/{name}")
    public String index (@PathVariable("name") String name, Model model){

        WeatherData weatherData = weatherDataService.getWeatherData(name);
        model.addAttribute("weatherData", weatherData);
        List<Weather> weather = weatherData.getWeather();
        model.addAttribute("weather", weather);
        //nedenstående metode burde gemme weatherData objektet fra json, men det virker ikke :-/
        //weatherDataService.saveWeatherData(weatherData);
         return "weatherData";
    }


}
