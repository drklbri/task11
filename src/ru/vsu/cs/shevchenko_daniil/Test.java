package ru.vsu.cs.shevchenko_daniil;

import java.io.IOException;

public class Test {

    public static void testing(String filePath, String correctAnswer) throws IOException {
        String fileString = Task.readFileIntoString(filePath);
        String answerString = Task.selectAllNumbers(fileString);
        if (answerString.equals(correctAnswer)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
            System.out.println("Ваш вывод: " + answerString);
            System.out.println("Правильный вывод: " + correctAnswer);
        }
    }
    
    public static void tests() throws IOException {
        Test.testing("test1.txt", "28, 1914, 11, 1918, 28, 1914, 70, 60, 9, 10, 7, 12, 1, 7, 8, 55, 9, 1917, 1918, 10");
        Test.testing("test2.txt", "2017, 34, 2020, 26,9");
        Test.testing("test3.txt", "23, 1995, 2, 2020, 2021");
        Test.testing("test4.txt", "1942, 10, 2,5, 100, 30, 5.5, 11, 424, 330, 13, 15");
        Test.testing("test5.txt", "0.5, 10, 6, 2, 2.5, 10, 15, 1101, 2, 10, 11");
    }
}
