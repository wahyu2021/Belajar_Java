package main.java.wahyu.todolist.repository;
import main.java.wahyu.todolist.model.TodoList;
import java.util.ArrayList;
import java.util.List;

public class TodoListRepositoryImpl implements TodoListRepository {
    private final List<TodoList> data = new ArrayList<>();

    @Override
    public void save(TodoList todoList) {
        data.add(todoList);
    }

    @Override
    public boolean remove(int number) {
        if (number >= 1 && number <= data.size()) {
            data.remove(number - 1);  // Menghapus berdasarkan indeks
            return true;
        }
        return false;
    }

    @Override
    public TodoList[] findAll() {
        return data.toArray(new TodoList[0]);
    }
}
