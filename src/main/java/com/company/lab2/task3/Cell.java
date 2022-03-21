package com.company.lab2.task3;

import java.util.ArrayList;

public class Cell {
    // Current step
    private Alive status;

    // Status for the next step
    private Alive nextStatus;

    // Handling neighbors
    private final ArrayList<Cell> neighbours;

    public Cell(Alive life) {
        neighbours = new ArrayList<Cell>();
        status = life;
    }

    @Override
    public String toString() {
        /*
        * Alive cell - O
        * Dead cell - X
        * */
        return status == Alive.ALIVE? "O" : "X";
    }

    public boolean isAlive() {
        return status == Alive.ALIVE;
    }

    public void addNeighbor(Cell cell) {
        neighbours.add(cell);
    }

    public void nextStep() {
        int aliveNeighbours = calculateAliveNeighbours();

        if (isAlive()) {
            if (aliveNeighbours > 3 || aliveNeighbours < 2) {
                setNextStatus(Alive.DEAD);
            } else {
                setNextStatus(Alive.ALIVE);
            }
        } else {
            if (aliveNeighbours == 3) {
                setNextStatus(Alive.ALIVE);
            } else {
                setNextStatus(Alive.DEAD);
            }
        }
    }

    public int calculateAliveNeighbours() {
        int count = 0;
        for (Cell cell : neighbours) {
            if (cell.isAlive()) {
                count += 1;
            }
        }
        return count;
    }

    public void setNextStatus(Alive status) {
        this.nextStatus = status;
    }

    public void applyNextStatus() {
        this.status = this.nextStatus;
        this.nextStatus = null;
    }
}
