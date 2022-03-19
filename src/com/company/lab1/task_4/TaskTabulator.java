package com.company.lab1.task_4;

import java.util.ArrayList;

public class TaskTabulator implements Tabulator {
    private Func func;

    TaskTabulator(Func func) {
        setFunc(func);
    }

    @Override
    public void setFunc(Func func) {
        this.func = func;
    }

    @Override
    public ArrayList<Point> tabulate(double xZero, double xEnd, double delta) {
        ArrayList<Point> points = new ArrayList<Point>();

        for (double inc = xZero; inc < xEnd; inc += delta) {
            points.add(this.func.calculate(inc));
        }

        return points;
    }
}
