package com.example.restService.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Clouds {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cloud_id;

    @Column(name = "cloud_data")
    private Integer all;

    @JsonIgnore
    @OneToOne
    private WeatherData weatherData;

    public Integer getCloud_id() {
        return cloud_id;
    }

    public void setCloud_id(Integer cloud_id) {
        this.cloud_id = cloud_id;
    }

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
