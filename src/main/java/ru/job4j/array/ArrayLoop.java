package ru.job4j.array;

/**
 * 6.0.4. Массивы и цикл for. [#226665]
 */
public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
