package controllers;

import data.dao.UserDao;
import models.User;

/**
 * Created by bombue on 26.02.16.
 */
public class UserController {
    public boolean register(String username, String password){
        if(username!= null && password != null && username.length() >0 && password.length() > 6){
            UserDao userDao = new UserDao();
            userDao.add(new User(username, password));
            return true;
        }
        return false;
    }
}
