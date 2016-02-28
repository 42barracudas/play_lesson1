package models;

import java.util.Date;

/**
 * Created by bombue on 26.02.16.
 */
public class TodoItem {

    public static final int STATE_DONE = 0;
    public static final int STATE_NOT_DONE = 1;

    private long id;
    private String title;
    private String description;
    private Date dueDate;
    private int state;

    public TodoItem(String title) {
        this.title = title;
        this.state = STATE_NOT_DONE;
    }

    public TodoItem(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.state = STATE_NOT_DONE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", state=" + state +
                '}';
    }
}
