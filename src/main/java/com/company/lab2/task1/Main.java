package com.company.lab2.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String vectorFixture = "fixtures/lab2/task1/matrix.txt";
    private static final int offset = 4;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File(vectorFixture));
        int n = s.nextInt();
        int[] array = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < array.length; i++) {
            if (!s.hasNextInt()) {
                System.out.println("Помилка, при зчитуванні даних. Перевірте дані.");
                System.exit(2);
            }

            array[i] = s.nextInt();
            newArray[(i + offset) % array.length] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
