package com.aquam.unit_8;

import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = getIntegers(4);
        printArray(arr);
        System.out.println("***********************");
        int[] sortedArr = sortIntegers(arr);
        printArray(sortedArr);

    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int forSwapping = array[i];
                    array[i] = array[j];
                    array[j] = forSwapping;
                }
            }
        }
        return array;
    }

    public static int[] sortIntegers2(int[] array) {
        boolean flag = true;    // один круг должен пройти с false - то есть не меняли
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i+1]) {
                    int forSwapping = array[i];
                    array[i] = array[i+1];
                    array[i+1] = forSwapping;
                }
            }
        }
        return array;
    }
}
