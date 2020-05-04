package com.example.restService.controllers;

import com.example.restService.models.Weather;
import com.example.restService.models.WeatherData;
import com.example.restService.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;


import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ApiService apiService;

    @GetMapping("/")
    public String index(Model model){

        return "home";
    }

    @PostMapping("/weatherData")
    public String weatherData(WebRequest wr){
        String name =wr.getParameter("name");

        return"redirect:/weatherData/"+name;
    }

    @GetMapping("weatherData/{name}")
    public String index (@PathVariable String name, Model model){

        WeatherData weatherData = apiService.getWeatherData(name);
        model.addAttribute("weatherData", weatherData);
        List<Weather> weather = weatherData.getWeatherList();
        model.addAttribute("weather", weather);

        apiService.saveWeatherData(weatherData);
         return "weatherData";
    }


}
