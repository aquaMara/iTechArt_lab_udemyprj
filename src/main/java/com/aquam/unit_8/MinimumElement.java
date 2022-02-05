package com.aquam.unit_8;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        int size = readInteger();
        int[] array = readElements(size);
        System.out.println(findMin(array));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i])
                minElement = array[i];
        }
        return minElement;
    }
}
