package ru.job4j.array;

/**
 * 6.1. Классический поиск перебором. [#33489]
 */
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < el; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
