package com.company.lab1.task_3;

import com.company.lab1.task_3.products.Product;

public interface ProductFactory {
    Product makeBurger(double price);
    Product makeSandwich(double price);
}
