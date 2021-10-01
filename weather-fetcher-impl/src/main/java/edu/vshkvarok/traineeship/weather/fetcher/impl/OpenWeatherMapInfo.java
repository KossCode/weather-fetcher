package edu.vshkvarok.traineeship.weather.fetcher.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMapInfo {
    private String country;
    private String city;
    private Date date;
    private OpenWeatherMapInfoWeather[] weather;
    private OpenWeatherMapInfoMain main;
}
