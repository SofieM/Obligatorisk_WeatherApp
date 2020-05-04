package com.example.restService.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "sky")
public class Clouds {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sky_id;

    @Column(name = "sky_data")
    private Integer all;

    @JsonIgnore
    @OneToOne
    private WeatherData weatherData;

    public Integer getSky_id() {
        return sky_id;
    }

    public void setSky_id(Integer sky_id) {
        this.sky_id = sky_id;
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
