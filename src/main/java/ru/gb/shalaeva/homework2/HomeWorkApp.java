package ru.gb.shalaeva.homework2;

public class HomeWorkApp {
    public static void main(String[] args) {
        printWordNTimes("text", 5);
        boolean test1 = within10and20(50, 10);
        if (test1 == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        isPositiveOrNegative(10);
        boolean test2 = isNegative(-100);
        if (test2 == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        boolean year = isLeapYear(2020);
        if (year == true) {
            System.out.println("is not a LeapYear");
        } else {
            System.out.println("is a LeapYear");
        }
    }

    //task1
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //task2
    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //task3
    public static boolean isNegative(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }

    }

    //task4

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word);
        }
    }

    // task 5

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        } else
            return false;
    }

}
