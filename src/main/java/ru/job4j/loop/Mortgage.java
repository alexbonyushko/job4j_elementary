package ru.job4j.loop;

/**
 * 5.7. Ипотека [#156315]
 */
public class Mortgage {
    public static int year(double amount, int salary, double persent) {
        int year = 0;
        while (amount + amount * (persent / 100) >= 0) {
            double duty = amount + amount * (persent / 100);
            amount = duty - salary;
            year++;
        }
        return year;
    }

}


