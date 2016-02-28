package data;

import models.TodoItem;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public interface DataManager {
    List<TodoItem> genAllTodoItems();
}
