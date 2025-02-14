package ru.job4j.array;

/**
 * 6.5.1. Поиск минимального числа в массиве. [#179803]
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
