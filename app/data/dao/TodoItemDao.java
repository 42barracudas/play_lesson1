package data.dao;

import data.DemoDataProvider;
import models.TodoItem;

import java.util.List;

/**
 * Created by bombue on 26.02.16.
 */
public class TodoItemDao implements GenericDAO<TodoItem> {
    @Override
    public List<TodoItem> findAll() {
        return DemoDataProvider.genListOfTodoItems(100);
    }

    @Override
    public void add(TodoItem todoItem) {

    }

    @Override
    public void delete(TodoItem todoItem) {

    }

    @Override
    public void update(TodoItem todoItem) {

    }

    @Override
    public TodoItem findByID(long id) {
        int i = (int)id-1;
        return DemoDataProvider.genListOfTodoItems(i+2).get(++i);
    }

    @Override
    public TodoItem find(TodoItem todoItem) {
        return null;
    }
}
