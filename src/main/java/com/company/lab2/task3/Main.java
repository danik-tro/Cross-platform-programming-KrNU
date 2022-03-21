package com.company.lab2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть розмір поля: ");
        int size = sc.nextInt();

        System.out.print("Введіть кількість кроків: ");
        int steps = sc.nextInt();


        Life life = new Life(size);

        System.out.println("Початкове поле: ");
        life.printField();
        System.out.println();

        for (int i = 0; i < steps; i++) {
            System.out.printf("Крок %d:\n", i + 1);
            life.nextStep();
            life.printField();
            System.out.println();
        }
    }
}
