package edu.vshkvarok.traineeship.weather.fetcher.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherInfoTest {

    private static final double DEGREES = 27.0d;
    private static final String OVERALL = "sunny";
    private static final String COUNTRY = "fakeCountry";
    private static final String CITY = "fakeCity";
    private static final Date DATE = new Date();

    private static final Temperature TEMPERATURE = new Temperature(
            Temperature.TemperatureScale.CELSIUS,
            DEGREES);

    private static final Weather WEATHER = new Weather(
            OVERALL,
            TEMPERATURE);

    private static final WeatherInfo WEATHER_INFO = new WeatherInfo(
            COUNTRY,
            CITY,
            DATE,
            WEATHER);

    @Test
    public void shouldBeEquals(){
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setCountry(COUNTRY);
        weatherInfo.setCity(CITY);
        weatherInfo.setDate(DATE);
        weatherInfo.setWeather(WEATHER);

        assertEquals(weatherInfo, WEATHER_INFO);
    }

}
