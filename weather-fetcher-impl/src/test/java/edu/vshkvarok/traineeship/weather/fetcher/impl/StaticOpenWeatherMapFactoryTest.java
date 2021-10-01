package edu.vshkvarok.traineeship.weather.fetcher.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StaticOpenWeatherMapFactoryTest {

    private static final String FAKE_URI = "FAKE_URI";

    @Test
    public void shouldReturnCorrectOpenWeatherMapClient(){
        OpenWeatherMapClient proxy = StaticOpenWeatherMapFactory.createProxy(
                FAKE_URI);

        assertNotNull(proxy);
    }
}
