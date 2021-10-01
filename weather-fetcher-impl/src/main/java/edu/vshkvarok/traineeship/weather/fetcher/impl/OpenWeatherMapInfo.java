package edu.vshkvarok.traineeship.weather.fetcher.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class OpenWeatherMapInfo {
    private String country;
    private String city;
    private Date date;
    private OpenWeatherMapInfoWeather[] weather;
    private OpenWeatherMapInfoMain main;
}
