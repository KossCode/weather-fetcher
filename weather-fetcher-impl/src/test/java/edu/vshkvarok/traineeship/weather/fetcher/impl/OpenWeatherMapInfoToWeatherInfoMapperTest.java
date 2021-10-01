package edu.vshkvarok.traineeship.weather.fetcher.impl;

import edu.vshkvarok.traineeship.weather.fetcher.model.Temperature;
import edu.vshkvarok.traineeship.weather.fetcher.model.Weather;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OpenWeatherMapInfoToWeatherInfoMapperTest {

    private static final OpenWeatherMapInfoWeather FAKE_WEATHER_DETAILS = new OpenWeatherMapInfoWeather(
            "testMain");

    private static final OpenWeatherMapInfoMain FAKE_WEATHER_MAIN = new OpenWeatherMapInfoMain(
            "27.0");

    private static final OpenWeatherMapInfoWeather[] openWeatherMapInfoWeathersArray = {
            FAKE_WEATHER_DETAILS };

    private static final WeatherInfo weatherInfo= new WeatherInfo(null, null, null, new Weather("testMain",
            new Temperature(Temperature.TemperatureScale.CELSIUS,
                    Double.parseDouble(FAKE_WEATHER_MAIN.getTemp()))));


    @Mock
    private static OpenWeatherMapInfo openWeatherMapInfo;

    @Test
    public void shouldReturnCorrectWeatherInfoObject() {

        when(openWeatherMapInfo.getWeather()).thenReturn(
                openWeatherMapInfoWeathersArray);
        when(openWeatherMapInfo.getMain()).thenReturn(FAKE_WEATHER_MAIN);

        WeatherInfo openWeatherInfo = OpenWeatherMapInfoToWeatherInfoMapper.convertToWeatherInfo(
                openWeatherMapInfo);
        assertEquals(openWeatherInfo.getWeather(),weatherInfo.getWeather());
    }
}
