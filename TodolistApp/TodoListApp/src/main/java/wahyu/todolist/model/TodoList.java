package main.java.wahyu.todolist.model;

public class TodoList {
    private String task;

    public TodoList(String task){
        this.task = task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
