package data.dao;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public interface GenericDAO<T> {
    List<T> findAll();
    void add(T t);
    void delete (T obj);
    void update(T t);
    T findByID(long id);
}
