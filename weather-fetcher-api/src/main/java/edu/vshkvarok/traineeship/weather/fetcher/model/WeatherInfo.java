package edu.vshkvarok.traineeship.weather.fetcher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class WeatherInfo {

    private String country;

    private String city;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy hh:mm aaa")
    private Date date;

    private Weather weather;

}
