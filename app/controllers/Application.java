package controllers;

import com.google.gson.Gson;
import models.TodoItem;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.todolistpage;

public class Application extends Controller {

    TodoItemsController todoItemsController = new TodoItemsController();
    UserController userController = new UserController();

    public Result index() {
        return ok(index.render("Your new bravo application is ready."));
    }

    public Result todolist(){
        return ok(todolistpage.render(todoItemsController.getTodoListAsStr()));
    }
    public Result todoitem(long id){
        Gson gson = new Gson();
        String jsonRes = gson.toJson(todoItemsController.getTodoItem(id), TodoItem.class);
//        JsonNode json = Json.toJson(todoItemsController.getTodoItem(id));
        return ok(todolistpage.render(jsonRes));
    }

    public Result register(){
        String userName = "";
        String password = "";
        boolean result = userController.register(userName, password);
        if(result == true){
            return ok();
        }else{
            return notFound();
        }
    }
}
