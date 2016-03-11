package controllers;

import data.dao.UserDao;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import views.html.profile;
import views.html.signup;

/**
 * Created by bombue on 26.02.16.
 */
public class UserController extends Controller {

    Form<User> userForm = Form.form(User.class);
    private User user;

    public Result signup(){
        return ok(signup.render(userForm));
    }

    public Result login(){
        return ok(login.render(userForm));
    }

    public Result submitLogin(){
        user = userForm.bindFromRequest().get();

        System.out.println(userForm.bindFromRequest().toString());

        if(userForm.hasErrors()){
            return badRequest(login.render(userForm));
        }

        UserDao userDao = new UserDao();
        if(userDao.find(user)==null){
            return redirect("http://www.google.com");
            //badRequest("Not found");
        }

        return profile();
    }

    public Result signupPost(){
        user = userForm.bindFromRequest().get();

        UserDao userDao = new UserDao();
        if(userDao.find(user).equals(user)){ //use e-mail for
            return badRequest("Already exists");
        }
        return ok(profile.render(user));

    }


    public boolean register(String username, String password){
        if(username!= null && password != null && username.length() >0 && password.length() > 6){
            UserDao userDao = new UserDao();
            userDao.add(new User(username, password));
            return true;
        }
        return false;
    }

    public Result profile(){
        return ok(profile.render(user));
    }
}
