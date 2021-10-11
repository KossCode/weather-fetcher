package edu.vshkvarok.traineeship.weather.fetcher.impl;

import edu.vshkvarok.traineeship.weather.fetcher.api.WeatherFetcher;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;
import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.repository.Repository;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class WeatherFetcherImpl implements WeatherFetcher {

    private final OpenWeatherMapProperties openWeatherMapProperties;
    private final OpenWeatherMapClient openWeatherMapClient;
    private final Repository repository;

    @Override
    public WeatherInfo getWeather(String country, String city) {

        String query = buildQuery(country, city);

        OpenWeatherMapInfo openWeatherInfo = openWeatherMapClient.getWeatherInfo(
                openWeatherMapProperties.getAppId(), query,
                openWeatherMapProperties.getUnits());

        openWeatherInfo.setCity(city);
        openWeatherInfo.setCountry(country);
        if(openWeatherInfo.getDate() == null){
            openWeatherInfo.setDate(new Date());
        }

        WeatherInfo weatherInfo = OpenWeatherMapInfoToWeatherInfoMapper
                .convertToWeatherInfo(openWeatherInfo);

        saveRecordToBase(weatherInfo);

        return weatherInfo;
    }

    private String buildQuery(String country, String city) {
        return String.format("%s,%s", city, country);
    }

    private void saveRecordToBase(WeatherInfo weatherInfoToConvert) {
        edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity.WeatherInfo weatherInfo = WeatherInfoToEntityConvertor.convert(
                weatherInfoToConvert);
        repository.create(weatherInfo);
    }

}
