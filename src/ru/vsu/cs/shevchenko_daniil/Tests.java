package ru.vsu.cs.shevchenko_daniil;

import ru.vsu.cs.shevchenko_daniil.utils.ArrayUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tests {

    public static void test(String filePath, String correctAnswer) throws IOException {
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
}
