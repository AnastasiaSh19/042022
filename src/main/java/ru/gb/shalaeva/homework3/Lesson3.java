package ru.gb.shalaeva.homework3;


import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println("");
        fillArray();
        System.out.println("");
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println("");
        fillDiagonal();
        System.out.println("");
        System.out.println(Arrays.toString(
                task5(5, 1)));
        System.out.println("");
        minMax();
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));

    }

    //task1
    public static void invertArray() {
        int[] arr = new int[]{0, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //task2
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //task3
    public static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] *= 2;
        return arr;
    }

    //task4
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][4 - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //task5
    public static int[] task5(int len, int initialValue) {
        int arr[] = new int[len];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //task6*
    public static void minMax() {
        int[] arr = {1, 30, 3, 4, 5, 6, 7, 8, 9, 0};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimal is " + min + " maximum is " + max);
    }

    //task7** {1, 1, 1, 2, 1}
    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        int halfSum = 0;
        int halfOrder = 0;
        int tempSum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        halfSum = sum/2;
        System.out.println(sum);
        if (sum % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                tempSum = tempSum + arr[i];
                System.out.println("temp " + tempSum + " - " + i);
                if(tempSum == halfSum) {
                    halfOrder = i;
                    System.out.println(halfOrder);
                    return true;
                }
            }
        }
        return false;
    }

       }


