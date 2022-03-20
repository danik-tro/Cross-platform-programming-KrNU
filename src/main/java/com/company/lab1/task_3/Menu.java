package com.company.lab1.task_3;

import com.company.lab1.task_3.products.Product;

import java.util.ArrayList;

public class Menu implements IMenu {
    ArrayList<Product> order;

    public Menu() {
        order = new ArrayList<Product>();
    }

    @Override
    public void addProduct(Product product) {
        order.add(product);
    }

    @Override
    public double summary() {
        double sum = 0;

        for (Product product: order) {
            sum += product.getPrice();
        }

        return sum;
    }
}
