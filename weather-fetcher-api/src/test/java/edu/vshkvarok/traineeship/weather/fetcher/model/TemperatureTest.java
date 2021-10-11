package edu.vshkvarok.traineeship.weather.fetcher.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    private static final Double DEGREES = 27.0d;
    private static final Temperature CREATED_BY_CONSTRUCTOR_EXAMPLE = new Temperature(
            Temperature.TemperatureScale.CELSIUS,
            DEGREES);
    @Test
    public void shouldBeEqualsBothClasses(){

        Temperature temperature = new Temperature();
        temperature.setScale(Temperature.TemperatureScale.CELSIUS);
        temperature.setDegree(DEGREES);

        assertEquals(CREATED_BY_CONSTRUCTOR_EXAMPLE, temperature);

    }
}
