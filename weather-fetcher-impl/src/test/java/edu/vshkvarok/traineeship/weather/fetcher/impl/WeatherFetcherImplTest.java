package edu.vshkvarok.traineeship.weather.fetcher.impl;

import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.repository.RepositoryImpl;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherFetcherImplTest {

    private static final Date currentDate = new Date();

    public static final OpenWeatherMapProperties FAKE_PROPERTIES = new OpenWeatherMapProperties(
            "fakeAppId", "fakeUUnits");

    public static final OpenWeatherMapInfoWeather FAKE_WEATHER_DETAILS = new OpenWeatherMapInfoWeather(
            "testMain");

    public static final OpenWeatherMapInfoMain FAKE_WEATHER_MAIN = new OpenWeatherMapInfoMain(
            "27.0");

    public static final OpenWeatherMapInfoWeather[] openWeatherMapInfoWeathersArray = {
            FAKE_WEATHER_DETAILS };

    public static final OpenWeatherMapInfo FAKE_WEATHER = new OpenWeatherMapInfo(
            "testCountryName", "testCityName", currentDate,
            openWeatherMapInfoWeathersArray, FAKE_WEATHER_MAIN);

    @Mock
    private OpenWeatherMapClient thirdPartyWeatherService;
    @Mock
    private RepositoryImpl repository;
    private WeatherFetcherImpl weatherFetcher;

    @BeforeEach
    void setUp() {
        weatherFetcher = new WeatherFetcherImpl(FAKE_PROPERTIES,
                thirdPartyWeatherService, repository);
    }

    @Test
    public void shouldReturnCorrectWeatherWhenCallGetWeather() {

        when(thirdPartyWeatherService.getWeatherInfo(any(), any(),
                any())).thenReturn(FAKE_WEATHER);
        WeatherInfo weatherInfo = OpenWeatherMapInfoToWeatherInfoMapper.convertToWeatherInfo(
                FAKE_WEATHER);

        WeatherInfo weather = weatherFetcher.getWeather("testCountryName",
                "testCityName");

        assertNotNull(weather);
        assertEquals(weatherInfo,
                weather);
    }

}
