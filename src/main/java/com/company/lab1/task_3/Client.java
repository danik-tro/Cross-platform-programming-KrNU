package com.company.lab1.task_3;

import java.util.Objects;
import java.util.Scanner;

public class Client {
    Customer customer;

    public Client(Customer customer) {
        this.customer = customer;
    }

    public void chooseCulinary(Scanner sc) {
        System.out.print("Оберіть кухню: ");
        while (true) {
            String culinary = sc.next();
            if (!customer.chooseCulinary(culinary)) {
                System.out.println("Спробуйте вибрати іншу кухню!");
            } else {
                System.out.println("Кухня обрана");
                break;
            }
        }
    }

    public void makingOrder(Scanner sc) {
        System.out.println("Щоб перейти до наступного клієнта, введіть 'X'.");
        System.out.println("------------------");
        while (true) {
            System.out.print("Оберіть страву: ");
            String wishes = sc.next();
            if (Objects.equals(wishes, "X")) {
                break;
            }

            if (!customer.makeOrder(wishes)) {
                System.out.println("Спробуйте обрати щось інше!");
            } else {
                System.out.println("Додано до замовлення!");
            }
        }
        System.out.println("------------------");
    }
}
