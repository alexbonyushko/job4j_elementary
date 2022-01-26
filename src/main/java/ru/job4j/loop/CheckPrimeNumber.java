package ru.job4j.loop;

/**
 * 5.5. Простое число [#171694]
 **/
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else if ((number % number == 0) && (number % 1 == 0)) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
