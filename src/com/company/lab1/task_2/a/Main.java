package com.company.lab1.task_2.a;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static int readAnswer(Scanner sc) {
        boolean success = false;
        int answer = 0;

        while (!success) {
            System.out.print("Введіть відповідь: ");
            if (sc.hasNextInt()) {
                success = true;
                answer = sc.nextInt();
            } else {
                sc.next();
                System.out.println("Невірний формат відповіді. Тільки цілі числа!\nСпробуйте знову!");
            }
        }
        return answer;
    }

    private static int askQuestion(Scanner sc, String question, int target) {
        System.out.println("----\nПитання №: ");
        System.out.println(question);
        int answer = readAnswer(sc);
        if (answer == target) {
            System.out.println("Вірно!");
            return 1;
        }
        System.out.printf("Невірно! Правильна відповідь: %d\n", target);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int results = 0;

        String[] questions = new String[]{
                "1. Професор ліг спати о 8 годині, а встав о 9 годині. Скільки годин проспав професор?",
                "2. На двох руках десять пальців. Скільки пальців на 10?",
                "3. Скільки цифр у дюжині?",
                "4. Скільки потрібно зробити розпилів, щоб розпиляти колоду на 12 частин?",
                "5. Лікар зробив три уколи в інтервалі 30 хвилин. скільки часу він витратив?",
                "6. Скільки цифр 9 в інтервалі 1100?",
                "7. Пастух мав 30 овець. Усі, крім однієї, розбіглися. Скільки овець лишилося?"
        };

        int[] targets = new int[] {1, 50, 2, 11, 30, 1, 1};


        for (int i = 0; i < questions.length; i++) {
            results += askQuestion(sc, questions[i], targets[i]);
        }

        HashMap<Integer, String> answersResults = new HashMap<Integer, String>() {{
            put(7, "Геній");
            put(6, "Ерудит");
            put(5, "Нормальний");
            put(4, "Здібності середні");
            put(3, "Здібності нижче середнього");
        }};

        System.out.printf("Кількість правильних відповідей: %d\n", results);
        System.out.printf(
                "Ваш статус: %s!\n",
                answersResults.getOrDefault(results, "Вам треба відпочити")
        );
    }

}
