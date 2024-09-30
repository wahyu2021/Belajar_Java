package main.java.wahyu.todolist.view;

import main.java.wahyu.todolist.service.TodoListService;
import main.java.wahyu.todolist.util.InputHelper;

public class TodoListView {
    private final TodoListService todoListService;

    public TodoListView(TodoListService todoListService){
        this.todoListService = todoListService;
    }

    public void run() {
        while (true) {
            System.out.println("\n");
            System.out.println("=====================================");
            System.out.println("==        Todolist Application     ==");
            System.out.println("=====================================");
            System.out.println("List:");
            this.todoListService.showTask();
            System.out.println("=====================================");
            System.out.println("1. Tambah Todolist");
            System.out.println("2. Hapus Todolist");
            System.out.println("x. exit");

            String pilihan = InputHelper.getInputString("Pilihan");

            switch (pilihan) {
                case "1":
                    addTodoList();
                    break;
                case "2":
                    removeTodoList();
                    break;
                case "x":
                case "X":
                    System.out.println("Sampai Jumpa Lagi");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    private void addTodoList() {
        // Implementasi menambahkan todolist
        System.out.println("Masukkan todolist baru:");
        String todo = InputHelper.getInputString("Task");
        todoListService.addTask(todo);
    }

    private void removeTodoList() {
        // Implementasi menghapus todolist
        System.out.println("Masukkan nomor todolist yang ingin dihapus:");
        int index = InputHelper.getInputNumber("Nomor");
        todoListService.removeTask(index);
    }


}
