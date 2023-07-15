package ru.job4j.array;

import java.util.Arrays;

/**
 * 6.8.1. Жадный алгоритм. Сдача в кофе машине [#34741 # [#34741]]
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        for (int i : coins) {
            while (diff >= i) {
                rsl[size++] = i;
                diff -= i;

            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
