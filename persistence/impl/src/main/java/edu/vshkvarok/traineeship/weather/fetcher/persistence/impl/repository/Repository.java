package edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.repository;

public interface Repository {
    void create(Object entity);
    void update(Object entity);
    void remove(Object entity);
}
