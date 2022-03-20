package com.company.lab1.task_3;

import com.company.lab1.task_3.products.Burger;
import com.company.lab1.task_3.products.Product;
import com.company.lab1.task_3.products.Sandwich;

public class UkrainianFactory implements ProductFactory {

    @Override
    public Product makeBurger(double price) {
        return new Burger("Ukrainian burger", price);
    }

    @Override
    public Product makeSandwich(double price) {
        return new Sandwich("Ukrainian sandwich", price);
    }
}
