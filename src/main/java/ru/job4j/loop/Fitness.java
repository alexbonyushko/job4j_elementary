package ru.job4j.loop;

/**
 * 5.4. Протеиновая диета [#156313]
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
