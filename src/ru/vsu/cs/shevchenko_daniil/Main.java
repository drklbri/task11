package ru.vsu.cs.shevchenko_daniil;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Писать цифры для проверки через запятую
        Tests.test("test1.txt", "28, 1914, 11, 1918, 28, 1914, 70, 60, 9, 10, 7, 12, 1, 7, 8, 55, 9, 1917, 1918, 10");
        Tests.test("test2.txt", "2017, 34, 2020, 26,9");
        Tests.test("test3.txt", "23, 1995, 2, 2020, 2021");
        Tests.test("test4.txt", "1942, 10, 2,5, 100, 30, 5.5, 11, 424, 330, 13, 15");
        Tests.test("test5.txt", "0.5, 10, 6, 2, 2.5, 10, 15, 1101, 2, 10, 11");
    }
}
