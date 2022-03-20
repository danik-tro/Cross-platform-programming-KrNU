package com.company.lab1.task_4;


import java.util.ArrayList;

public interface Tabulator {
    void setFunc(Func func);
    ArrayList<Point> tabulate(double xZero, double xEnd, double delta);
}
