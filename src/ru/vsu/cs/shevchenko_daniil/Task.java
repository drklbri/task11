package ru.vsu.cs.shevchenko_daniil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static String selectAllNumbers(String string) {
        String newString = null;

        newString = string.replaceAll("[^0-9]*[^,.0-9]+", " ");
        //Заменяем на пробелы все символы, что не находятся в скобках
        List<String> list = Arrays.asList(newString.trim().split(" "));
        //trim - обрезает лишние пробелы.
        return String.join(", ", list);
    }

    public static String readFileIntoString(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        String string = "";
        while (sc.hasNextLine())
            string = string.concat(sc.nextLine());
        return string;
    }
}
