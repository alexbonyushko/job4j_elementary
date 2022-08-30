package ru.job4j.array;

/**
 * 6.4.1. Сравнить последние элементы двух массивов [#304228]
 */
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[left.length - 1] == right[right.length - 1]) {
            return true;
        }
        return false;
    }
}
