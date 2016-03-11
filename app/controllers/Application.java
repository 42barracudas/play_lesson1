package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.todolistpage;


// import /home/bombue/.ivy2/cache/com.google.code.gson/gson/jars/gson-2.3.jar!/com/google/gson

public class
Application extends Controller {

    TodoItemsController todoItemsController = new TodoItemsController();
    UserController userController = new UserController();

    public Result index() {
        return ok(index.render("Your new bravo application is ready."));
    }

    public Result todolist(){
        return ok(todolistpage.render(todoItemsController.getTodoListAsStr()));
    }
    public Result todoitem(long id) {
        //Gson gson = new Gson();
        //String jsonRes = gson.toJson(todoItemsController.getTodoItem(id), TodoItem.class);
        //JsonNode json = Json.toJson(todoItemsController.getTodoItem(id));
        //return ok(todolistpage.render(jsonRes));
        return ok(todolistpage.render("item ID is:"+ id));
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
