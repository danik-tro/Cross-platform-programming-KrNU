package com.company.lab1.task_1;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    private static int readInteger(@NotNull Scanner sc, String message) {
        System.out.print(message);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }

        System.out.println("Помилка, ви повинні ввести ціле число.");
        System.exit(2);
        return -1;
    }

    private static boolean readBoolean(@NotNull Scanner sc, String message) {
        System.out.print(message);
        if (sc.hasNextBoolean()) {
            return sc.nextBoolean();
        }

        System.out.println("Помилка, ви повинні ввести true/false.");
        System.exit(2);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = readInteger(sc, "Введіть A: ");
        int i = readInteger(sc, "Введіть I: ");
        int c = readInteger(sc, "Введіть C: ");
        boolean l = readBoolean(sc, "Введіть L: ");

        System.out.print("Введіть Name: ");
        String name = sc.next();

        System.out.println("-------\nВведені змінні:");
        System.out.printf("A: %d\nI: %d\nC: %d\nL: %b\nName: %s%n", a, i, c, l, name);
    }
}
