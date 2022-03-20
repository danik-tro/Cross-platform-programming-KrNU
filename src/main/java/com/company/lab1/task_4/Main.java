package com.company.lab1.task_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double xZero = -.05, xEnd = 0.15, delta = .01;
        ArrayList<Point> points = new TaskTabulator(new TaskFunction()).tabulate(xZero, xEnd, delta);
        points.forEach((Main::printPoint));
    }

    private static void printPoint(Point p) {
        if(p == null) {
            System.out.println("(X: null; Y: null)");
            return;
        }
        System.out.printf("(X: %f; Y: %f)\n", p.getX(), p.getY());
    }
}
