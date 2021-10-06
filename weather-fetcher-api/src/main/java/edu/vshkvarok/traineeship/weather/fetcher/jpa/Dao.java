package edu.vshkvarok.traineeship.weather.fetcher.jpa;

public interface Dao<E> {
    void create(E entity);
    void update(E entity);
    void remove(E entity);
}
