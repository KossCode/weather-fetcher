package edu.vshkvarok.traineeship.weather.fetcher.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.vshkvarok.traineeship.weather.fetcher.model.Weather;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;
import lombok.Data;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMapInfo {
    private String country;
    private String city;
    private Date date;
    private Map[] weather;
    private Map<String, String> main;

    public WeatherInfo convertToWeatherInfo(){
        String overall = this.weather[0].get("main").toString();
        Map<String, String> temperature = new LinkedHashMap<>();
        temperature.put("scale", "CELSIUS");
        temperature.put("degrees", this.main.get("temp"));

        Weather weather = new Weather(overall, temperature);

        WeatherInfo weatherInfo = new WeatherInfo(
                this.country,
                this.city,
                this.date,
                weather);

        return weatherInfo;
    }
}
