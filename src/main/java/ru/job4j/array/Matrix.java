package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiTable = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                multiTable[i - 1][j - 1] = i * j;
            }
        }
        return multiTable;
    }
}