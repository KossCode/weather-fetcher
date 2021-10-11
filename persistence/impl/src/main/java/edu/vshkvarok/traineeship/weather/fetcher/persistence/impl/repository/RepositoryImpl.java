package edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.repository;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class RepositoryImpl implements Repository {

    @PersistenceContext(unitName = "weather-hibernate")
    @Getter
    private EntityManager entityManager;

    @Override
    public void create(Object o) {
        entityManager.persist(o);
    }

    @Override
    public void update(Object o) {
        entityManager.merge(o);
    }

    @Override
    public void remove(Object o) {
        entityManager.remove(o);
    }
}
