package main.java.wahyu.todolist.service;

import main.java.wahyu.todolist.model.TodoList;
import main.java.wahyu.todolist.repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void addTask(String task) {
        TodoList todoList = new TodoList(task);
        this.todoListRepository.save(todoList);
        System.out.println("Success");
    }

    @Override
    public void removeTask(int number) {
        if(this.todoListRepository.remove(number)){
            System.out.println("Success");
        } else{
            System.out.println("Fail");
        }
    }

    @Override
    public void showTask() {
        TodoList[] todolist = todoListRepository.findAll();
        for(int i = 0; i < todolist.length; i++){
            System.out.println(i+1 + ". " + todolist[i].getTask());
        }
    }
}
