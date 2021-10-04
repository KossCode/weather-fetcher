package edu.vshkvarok.traineeship.weather.fetcher.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherTest {

    private static final double DEGREES = 27.0d;
    private static final String OVERALL = "sunny";

    private static final Temperature TEMPERATURE = new Temperature(
            Temperature.TemperatureScale.CELSIUS,
            DEGREES);

    private static final Weather WEATHER = new Weather(
            OVERALL,
            TEMPERATURE);

    @Test
    public void shouldBeEquals() {
        Weather weatherToCompare = new Weather();
        weatherToCompare.setOverall(OVERALL);
        weatherToCompare.setTemperature(TEMPERATURE);

        assertEquals(WEATHER, weatherToCompare);
    }

}
