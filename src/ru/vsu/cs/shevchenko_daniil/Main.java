package ru.vsu.cs.shevchenko_daniil;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Запустить тесты?");
        String userEnter = sc.nextLine();
        boolean noFlag = false;
        if (userEnter.equals("Да") || userEnter.equals("да") || userEnter.equals("Yes") || userEnter.equals("yes")) {
            Test.tests();
            System.out.println("Желаете числа в собственном тексте?");
        } else if (userEnter.equals("Нет") || userEnter.equals("нет") || userEnter.equals("no") || userEnter.equals("No")) {
            noFlag = true;
            System.out.println("Желаете числа в собственном тексте?");
        } else {
            System.out.println("Некорректный ввод");
        }
            userEnter = sc.nextLine();
        if (userEnter.equals("Да") || userEnter.equals("да") || userEnter.equals("Yes") || userEnter.equals("yes")) {
            System.out.println("Введите текст в одну строку");
            String userString = sc.nextLine();
            System.out.println(Task.selectAllNumbers(userString) + "\nПрограмма завершила свою работу");
        } else System.out.print("Программа завершила свою работу");
    }
}
