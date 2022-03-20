package com.company.lab2.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String vectorFixture = "fixtures/lab2/task2/matrix.txt";
    private static final int matrixSize = 10;

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element: row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File(vectorFixture));

        int[][] array = new int[matrixSize][matrixSize];
        int[][] newArray = new int[matrixSize][matrixSize];

        int positiveAvg = 0;
        int countOfPositive = 0;

        int negativeAvg = 0;
        int countOfNegative = 0;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (!s.hasNextInt()) {
                    System.out.println("Помилка, при зчитуванні даних. Перевірте дані.");
                    System.exit(2);
                }
                array[i][j] = s.nextInt();

                if (array[i][j] >= 0) {
                    countOfPositive += 1;
                    positiveAvg += array[i][j];
                } else {
                    countOfNegative += 1;
                    negativeAvg += array[i][j];
                }

                if (array[i][j] < 15) {
                    newArray[i][j] = -array[j][i];
                } else {
                    newArray[i][j] = array[i][j];
                }

            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (array[i][j] < 15) {
                    newArray[i][j] = -array[j][i];
                } else {
                    newArray[i][j] = array[i][j];
                }
            }
        }

        float pAvg = (float)1.0*positiveAvg / countOfPositive;
        float nAvg = (float)1.0*negativeAvg / countOfNegative;

        System.out.println("Введена матриця з файлу:");
        printMatrix(array);

        System.out.println();
        System.out.printf("Середнє значення позитивних чисел: %f\n", pAvg);
        System.out.printf("Середнє значення негативних чисел: %f\n", nAvg);
        System.out.printf("Різниця: %f\n", pAvg - nAvg);

        System.out.println();
        System.out.println("Нова створена матриця:");
        printMatrix(newArray);
    }
}
