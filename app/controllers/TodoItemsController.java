package controllers;

import data.dao.TodoItemDao;
import models.TodoItem;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public class TodoItemsController {

    private TodoItemDao todoItemDao;

    public TodoItem getTodoItem(long id){
        todoItemDao = new TodoItemDao();
return todoItemDao.findByID(id);
    }

    public String getTodoListAsStr() {
        todoItemDao = new TodoItemDao();
        List<TodoItem> list = todoItemDao.findAll();
        String listStr = "";
        for (TodoItem item : list) {
            listStr += item.toString().concat("\n");
        }
        return listStr;
    }

}
