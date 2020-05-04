
package com.example.restService.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
@Entity
public class Main {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;

    private Double temp;
    private Double feelsLike;
    private Double tempMin;
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;

    @JsonIgnore
    @OneToOne
    private WeatherData weatherData;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
