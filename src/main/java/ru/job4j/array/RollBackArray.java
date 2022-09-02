package ru.job4j.array;

/**
 * 6.4.2. Обход массива с последнего элемента [#361619]
 */
public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }
}
