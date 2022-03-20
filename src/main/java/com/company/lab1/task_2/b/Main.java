package com.company.lab1.task_2.b;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(new FileReader("task2.b-config.json"));

        long A2B = (long)object.get("A2B");
        long B2C = (long)object.get("B2C");
        long capacity = (long)object.get("capacity");
        long vantage = (long)object.get("vantage");

        long fuelUse;

        if (vantage < 500) {
            fuelUse = 1;
        } else if(vantage < 1000) {
            fuelUse = 4;
        } else if (vantage < 1500) {
            fuelUse = 7;
        } else if (vantage < 2000) {
            fuelUse = 9;
        } else {
            System.out.println("Літак не полетить. Літак не підніме такий груз.");
            fuelUse = -1;
            System.exit(2);
        }

        long a2b = A2B * fuelUse;
        long b2c = B2C * fuelUse;

        if (a2b + b2c <= capacity) {
            System.out.println("Мінімальна дозаправка: 0");
            System.exit(0);
        }

        if (a2b > capacity) {
            System.out.println("Недостатньо палива в баці, щоб долетіти до пункту B.");
            System.exit(2);
        }

        long restOf = capacity - a2b;

        if (b2c > capacity) {
            System.out.println("Недостатньо палива в баці, щоб долетіти до пункту C.");
            System.exit(2);
        }

        long end = restOf - b2c;
        System.out.printf("Мінімальна дозаправка: %d\n", end < 0 ? -end : 0);
    }
}
