package com.company.lab1.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість людей: ");

        if (!sc.hasNextInt()) {
            System.out.println("Помилка");
            System.exit(2);
        }

        int nClients = sc.nextInt();

        Customer customer = new Customer();

        for (int i = 0; i < nClients; i++) {
            System.out.printf("Клієнт  №%d\n", i + 1);
            Client client = new Client(customer);
            client.chooseCulinary(sc);
            client.makingOrder(sc);
        }

        System.out.printf("Загальна вартість замовлення: %f", customer.check());
    }
}
