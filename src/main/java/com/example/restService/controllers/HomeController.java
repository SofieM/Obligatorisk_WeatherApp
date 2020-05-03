package com.example.restService.controllers;

import com.example.restService.models.WeatherData;
import com.example.restService.services.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    WeatherDataService weatherDataService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        return "index";
    }

    @RequestMapping(value = "/weatherData/{name}", method = RequestMethod.GET)
    public String index (@PathVariable("name") String name, Model model){

        model.addAttribute("weatherData", weatherDataService.getWeatherData(name));
         return "weatherData";
    }


}
