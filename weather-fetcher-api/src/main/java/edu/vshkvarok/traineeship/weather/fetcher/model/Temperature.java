package edu.vshkvarok.traineeship.weather.fetcher.model;

import lombok.Data;

@Data
public class Temperature {
    private TemperatureScale scale;
    private double degree;

    public enum TemperatureScale {
        CELSIUS
    }
}
