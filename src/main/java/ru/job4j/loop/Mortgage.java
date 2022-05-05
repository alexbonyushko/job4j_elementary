package ru.job4j.loop;

/**
 * 5.7. Ипотека [#156315]
 */
public class Mortgage {
    public static int year(double amount, int salary, double persent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + amount * (persent / 100) - salary;
            year++;
        }
        return year;
    }

}


