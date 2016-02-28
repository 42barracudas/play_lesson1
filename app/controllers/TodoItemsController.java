package controllers;

import data.dao.TodoItemDao;
import models.TodoItem;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public class TodoItemsController {

    public String getTodoListAsStr() {
        TodoItemDao todoItemDao = new TodoItemDao();
        List<TodoItem> list = todoItemDao.findAll();
        String listStr = "";
        for (TodoItem item : list) {
            listStr += item.toString().concat("\n");
        }
        return listStr;
    }

}
