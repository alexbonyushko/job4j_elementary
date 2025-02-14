package ru.job4j.condition;

/**
 * 4.6.1. Switch [#334070]
 * Определения дня недели
 */
public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Error";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(3));
    }

}
