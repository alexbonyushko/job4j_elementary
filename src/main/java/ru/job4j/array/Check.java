package ru.job4j.array;

/**
 * 6.3. Массив заполнен true или false [#53857]
 */
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                return result;
            } else {
                result = false;
            }

        }
        return result;
    }
}
