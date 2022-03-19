package com.company.lab1.task_3;

import com.company.lab1.task_3.products.Product;

public class Customer {
    private Menu menu;
    private ProductFactory factory;

    private final double burgerPrice = 13.15;
    private final double sandwichPrice = 8.45;


    Customer() {
        menu = new Menu();
    }

    public boolean chooseCulinary(String cuisine) {
        switch (cuisine) {
            case "Ukrainian": {
                factory = new UkrainianFactory();
                break;
            }
            default: {
                System.out.println("Невідома кухня...");
                return false;
            }
        }
        return true;
    }

    public double check() {
        return menu.summary();
    }

    public boolean makeOrder(String product) {
        Product takenProduct;

        switch (product) {
            case "Burger": {
                takenProduct = factory.makeBurger(burgerPrice);
                break;
            }
            case "Sandwich": {
                takenProduct = factory.makeSandwich(sandwichPrice);
                break;
            }

            default: {
                System.out.println("Невідома їжа...");
                return false;
            }
        }
        menu.addProduct(takenProduct);
        return true;
    }
}
