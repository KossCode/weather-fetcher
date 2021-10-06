package edu.vshkvarok.traineeship.weather.fetcher.jpa;

public interface WeatherInfoDao<WeatherInfo> extends Dao<WeatherInfo>{
    @Override
    default void create(WeatherInfo entity) {
    }

    @Override
    default void update(WeatherInfo entity) {
    }

    @Override
    default void remove(WeatherInfo entity) {
    }
}
