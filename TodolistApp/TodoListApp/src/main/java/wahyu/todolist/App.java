package main.java.wahyu.todolist;

import main.java.wahyu.todolist.repository.TodoListRepositoryImpl;
import main.java.wahyu.todolist.service.TodoListServiceImpl;
import main.java.wahyu.todolist.view.TodoListView;

public class App {
    public static void main(String[] args) {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServiceImpl todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListView.run();
    }
}
