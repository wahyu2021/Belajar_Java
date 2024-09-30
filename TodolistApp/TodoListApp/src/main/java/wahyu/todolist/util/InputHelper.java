package main.java.wahyu.todolist.util;

import java.util.Scanner;

public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInputString(String prompt){
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public static int getInputNumber(String prompt){
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
