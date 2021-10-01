package edu.vshkvarok.traineeship.weather.fetcher.impl;

import edu.vshkvarok.traineeship.weather.fetcher.model.Temperature;
import edu.vshkvarok.traineeship.weather.fetcher.model.Weather;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;

public class OpenWeatherMapInfoToWeatherInfoMapper {

    public static WeatherInfo convertToWeatherInfo(
            OpenWeatherMapInfo openWeatherMapInfo) {

        String overall = openWeatherMapInfo.getWeather()[0].getMain();

        Temperature temperature = new Temperature();
        temperature.setScale(Temperature.TemperatureScale.CELSIUS);
        temperature.setDegree(
                Double.parseDouble(openWeatherMapInfo.getMain().getTemp()));

        Weather weather = new Weather(overall, temperature);

        WeatherInfo weatherInfo = new WeatherInfo(
                openWeatherMapInfo.getCountry(),
                openWeatherMapInfo.getCity(),
                openWeatherMapInfo.getDate(),
                weather);

        return weatherInfo;
    }

}
