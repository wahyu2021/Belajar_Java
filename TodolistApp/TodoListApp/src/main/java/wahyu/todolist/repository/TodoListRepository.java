package main.java.wahyu.todolist.repository;
import main.java.wahyu.todolist.model.TodoList;


public interface TodoListRepository {
    void save(TodoList todoList);
    boolean remove(int number);
    TodoList[] findAll();
}
