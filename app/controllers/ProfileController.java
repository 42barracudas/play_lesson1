package controllers;

import data.dao.UserDao;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.profile;

/**
 * Created by bombue on 3/11/16.
 */
public class ProfileController extends Controller {
    public Result profile(){
        UserDao userDao = new UserDao();
        User user = userDao.findAll().get(0);
        return ok(profile.render(user));

    }
}
