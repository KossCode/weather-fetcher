package edu.vshkvarok.traineeship.weather.fetcher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WeatherInfo {


    @JsonIgnore
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy hh:mm aaa")
    @Column(name = "DATE")
    private Date date;

    private Weather weather;

    public WeatherInfo(String country, String city, Date date,
            Weather weather) {
        this.country = country;
        this.city = city;
        this.date = date;
        this.weather = weather;
    }

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
