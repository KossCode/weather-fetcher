package edu.vshkvarok.traineeship.weather.fetcher.impl;

import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity.Temperature;
import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity.Weather;
import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity.WeatherInfo;

public class WeatherInfoToEntityConvertor {

    public static WeatherInfo convert(
            edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo weatherInfo){

        WeatherInfo weatherInfoEntity = new WeatherInfo();

        weatherInfoEntity.setCountry(weatherInfo.getCountry());
        weatherInfoEntity.setCity(weatherInfo.getCity());
        weatherInfoEntity.setDate(weatherInfo.getDate());
        weatherInfoEntity.setWeather(convertWeather(weatherInfo.getWeather()));

        return weatherInfoEntity;
    }

    private static Weather convertWeather(
            edu.vshkvarok.traineeship.weather.fetcher.model.Weather weather){
        Weather weatherEntity = new Weather();
        weatherEntity.setTemperature(convertTemperature(weather.getTemperature()));
        weatherEntity.setOverall(weather.getOverall());
        return weatherEntity;
    }

    private static Temperature convertTemperature(
            edu.vshkvarok.traineeship.weather.fetcher.model.Temperature temp){

        Temperature temperatureEntity = new Temperature();
        temperatureEntity.setDegree(temp.getDegree());

        if (temp.getScale().equals(
                edu.vshkvarok.traineeship.weather.fetcher.model.Temperature.TemperatureScale.CELSIUS)) {
            temperatureEntity.setScale(Temperature.TemperatureScale.CELSIUS);
        }

        return temperatureEntity;
    }
}
