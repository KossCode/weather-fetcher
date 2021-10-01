package edu.vshkvarok.traineeship.weather.fetcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {
    private String overall;
    private Temperature temperature;
}
