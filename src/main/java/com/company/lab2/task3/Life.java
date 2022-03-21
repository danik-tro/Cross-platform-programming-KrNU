package com.company.lab2.task3;

public class Life {
    private final Cell[][] matrix;

    private void fillNeighbours(int x, int y) {
        if (x - 1 >= 0 && y - 1 >= 0) {
            matrix[x][y].addNeighbor(matrix[x-1][y-1]);
        }

        if (y - 1 >= 0) {
            matrix[x][y].addNeighbor(matrix[x][y-1]);
        }

        if (x - 1 >= 0) {
            matrix[x][y].addNeighbor(matrix[x-1][y]);
        }

        if (x + 1 < matrix.length && y + 1 < matrix.length) {
            matrix[x][y].addNeighbor(matrix[x+1][y+1]);
        }

        if (x + 1 < matrix.length && y - 1 >= 0) {
            matrix[x][y].addNeighbor(matrix[x+1][y-1]);
        }

        if (x - 1 >= 0 && y + 1 < matrix.length) {
            matrix[x][y].addNeighbor(matrix[x-1][y+1]);
        }

        if (x + 1 < matrix.length) {
            matrix[x][y].addNeighbor(matrix[x+1][y]);
        }

        if (y + 1 < matrix.length) {
            matrix[x][y].addNeighbor(matrix[x][y+1]);
        }
    }

    public Life(int size) {
        matrix = new Cell[size][size];

        // Filling cells with random values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Math.random() > .5) {
                    matrix[i][j] = new Cell(Alive.ALIVE);
                } else {
                    matrix[i][j] = new Cell(Alive.DEAD);
                }
            }
        }

        // Adding neighbours
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fillNeighbours(i, j);
            }
        }
    }

    public void printField() {
        for (Cell[] row : matrix) {
            for (Cell cell: row) {
                System.out.printf("%s ", cell.toString());
            }
            System.out.println();
        }
    }

    public void nextStep() {
        // Simulate next step
        for (Cell[] row : matrix) {
            for (Cell cell : row) {
                cell.nextStep();
            }
        }

        // Apply step
        for (Cell[] row : matrix) {
            for (Cell cell : row) {
                cell.applyNextStatus();
            }
        }
    }

}
