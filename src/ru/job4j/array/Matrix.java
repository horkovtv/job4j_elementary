package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return  matrix;
    }
}
