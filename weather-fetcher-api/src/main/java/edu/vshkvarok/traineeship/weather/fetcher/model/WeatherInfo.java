package edu.vshkvarok.traineeship.weather.fetcher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherInfo {

    private String country;

    private String city;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy hh:mm aaa")
    private Date date;

    private Weather weather;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        WeatherInfo that = (WeatherInfo) o;
        return country.equals(that.country) && city.equals(that.city)
                && Objects.equals(date, that.date) && weather.equals(
                that.weather);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, date, weather);
    }
}
