package com.example.restService.controllers;

import com.example.restService.models.Weather;
import com.example.restService.models.WeatherData;
import com.example.restService.services.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

        model.addAttribute("weatherData", weatherDataService.getWeatherData(name));
        List<Weather> weather = weatherDataService.getWeatherData(name).getWeather();
        model.addAttribute("weather", weather);
         return "weatherData";
    }


}
