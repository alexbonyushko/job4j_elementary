package ru.job4j.array;

/**
 * 6.0.1. Объявление массива.[#3613]
 * 6.0.2. Размер массива [#333582]
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
    }
}
