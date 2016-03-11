package data.dao;

import data.DemoDataProvider;
import models.User;

import javax.annotation.Nonnull;
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

    @Override
    public User find(@Nonnull User user) {
        List<User> users = DemoDataProvider.genListOfUsers(5);

        for(User item: users){
            System.out.println("=============================");
            System.out.println(item.toString());
            System.out.println(user.toString());
            System.out.println("=============================");
            if(user.getEmail().equals(item.getEmail()) && user.getPassword().equals(item.getPassword()) ){
                return item;
            }
        }
        return null;
    }
}
