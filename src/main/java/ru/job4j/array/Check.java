package ru.job4j.array;

/**
 * 6.3. Массив заполнен true или false [#53857]
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
