package ru.job4j.array;

/**
 * 6.6.4. Двухмерный массив. Таблица умножения. [#33491]
 */
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}