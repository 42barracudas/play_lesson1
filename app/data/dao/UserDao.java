package data.dao;

import data.DemoDataProvider;
import models.User;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public class UserDao implements GenericDAO<User> {
    @Override
    public List<User> findAll() {
        return DemoDataProvider.genListOfUsers(5);
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findByID(long id) {
        return null;
    }
}
