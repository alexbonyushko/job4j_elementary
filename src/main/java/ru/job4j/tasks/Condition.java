package ru.job4j.tasks;

/**
 * 1.1.4. Оператор ветвления - упражения
 */
public class Condition {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        double sum = percent * prize;
        double res = sum - pay;
        if (sum > pay && res > 0) {
            rsl = (int) res;
        }
        return rsl;
    }

    public static int countCup(int count, int n) {
        int rsl = count;
        if (count >= n) {
            rsl = count / n + count;
        }
        return rsl;
    }

    public static String selectAction(int left, int right, int rsl) {
        String res = "none";
        if (rsl == left + right) {
            res = "added";
        } else if (rsl == left - right) {
            res = "subtracted";
        } else if (rsl == left * right) {
            res = "multiplied";
        } else if (rsl == left / right) {
            res = "divided";
        }
        return res;
    }

    public static String checkNumberHelloWorld(int number) {
        String rsl = "Operation not support";
        if (number % 3 == 0 && number % 5 == 0) {
            rsl = "Hello, World!!!";
        } else if (number % 5 == 0) {
            rsl = "World";
        } else if (number % 3 == 0) {
            rsl = "Hello";
        }
        return rsl;
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
          return false;
        }
        return false;
    }

    public static boolean checkAttackRook(String left, String right) {
        boolean result = false;
        char firstSymbolLeft = left.charAt(0);
        char secondSymbolLeft = left.charAt(1);
        char firstSymbolRight = right.charAt(0);
        char secondSymbolRight = right.charAt(1);
        if (firstSymbolLeft == firstSymbolRight || secondSymbolLeft == secondSymbolRight) {
            result = true;
        }
        return result;
    }

    public static boolean checkPairsCharString(String l, String r) {
        boolean result = false;
        if (l.equals("") && r.equals("")) {
            result = true;
        } else if (l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0)) {
            result = true;
        }
        return result;
    }

    public static void out(int n) {
        for (int i = n; i >= 0; i--) {
            if (i < n) {
                System.out.println(i);
            }
        }
    }

    public static void outFromMToN(int m, int n) {
        while (m > n) {
            System.out.println(m);
            m--;
        }
    }

    public static void sweetPrice(int price) {
        for (int weight = 1; weight <= 5; weight++) {
            System.out.println(weight * price);
        }
    }

    public static int multiplicationLoop(int a, int b) {
        int res = 1;
        for (int i = a; i <= b; i++) {
            res *= i;
        }
        return res;
    }

    public static int degreeLoop(int a, int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * a;
        }
        return res;
    }

    public static void multipliers(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int oddCount(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int secondSum(int a, int b) {
        int result = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            System.out.println("index = " + i + " | " + "count = " + count);
            if (count % 2 == 0) {
                result = result + i;
            }
            count++;

        }
        return result;
    }

    public static int sectionCount(int length, int section) {
        int count = 0;
        while (section <= length) {
            section++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(countCup(7, 6));
//        System.out.println(selectAction(6, 2, 3));
//        System.out.println(checkNumberHelloWorld(5));
//        System.out.println(checkYear(1800));
//        out(10);
//        outFromMToN(10,6);
//        SweetPrice(10);
//        System.out.println(multiplicationLoop(1, 3));
//        System.out.println(degreeLoop(2, 3));
        //multipliers(6);
//        System.out.println(oddCount(1,5));
//        System.out.println("count" + "=" + oddCount(1, 4));
//        System.out.println(secondSum(3, 10));
        System.out.println(sectionCount(4, 2));

    }
}
