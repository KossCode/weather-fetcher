package com.nixsolutions.repo;

import edu.vshkvarok.traineeship.weather.fetcher.jpa.WeatherInfoDao;
import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class HibernateWeatherInfoDao implements WeatherInfoDao<WeatherInfo> {

    @PersistenceContext(unitName = "weather-hibernate")
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    @Override
    public void create(WeatherInfo weatherInfo) {
        entityManager.persist(weatherInfo);
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    @Override
    public void update(WeatherInfo weatherInfo) {
        entityManager.persist(weatherInfo);
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    @Override
    public void remove(WeatherInfo weatherInfo) {
        entityManager.remove(weatherInfo);
    }
}
