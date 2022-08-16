package ru.job4j.array;

/**
 * 6.0.4. Массивы и цикл for. [#226665]
 * 6.0.5. Массивы и цикл for-each [#333581]
 */
public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
