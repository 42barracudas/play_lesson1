package data;

import models.TodoItem;
import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public class DemoDataProvider {

    public static List<TodoItem> genListOfTodoItems(int amount){
        List<TodoItem> result = new ArrayList<>();
        for(int i = 0; i < amount; i++){
            TodoItem item = new TodoItem("Title" + i);
            result.add(item);
        }
        return result;
    }

    public static List<User> genListOfUsers(int amount){
        List<User> result = new ArrayList<>();
        for(int i = 0; i < amount; i++){
            User item = new User("userName" + i, "paass");
            result.add(item);
        }
        return result;
    }
}
