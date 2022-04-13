
package ru.gb.shalaeva.homework1;

public class HomeWorkApp {

    // task 5
    public static void compareNumbers() {
        int a = 100;
        int b = 200;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    // task 4

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }



    // 3 task

    public static void checkSumSign() {
    int a =10;
    int b = 20;
    int c = a+b;
    if (c >=0) {
        System.out.println("Sum is >0");
    } else {
        System.out.println("Sum is <0");
    }

    }

    // 2 task
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    // 1 task
    public static void main (String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    }




