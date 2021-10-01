package edu.vshkvarok.traineeship.weather.fetcher.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMapInfoWeather {
    private String main;
}
