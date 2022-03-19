package com.company.lab1.task_4;

public class TaskFunction implements Func {
    private final double b = 6.74;


    @Override
    public Point calculate(double x) {
        if (!isAvailable(x)) {
            return null;
        }
        double y = Math.pow(0.810, 5) * Math.pow(Math.pow(x, 3) + Math.pow(b, 3), 7.0/6.0);
        return new Point(x, y);
    }

    @Override
    public boolean isAvailable(double x) {
        return !(Math.pow(x, 3) + Math.pow(b, 3) < 0);
    }
}
