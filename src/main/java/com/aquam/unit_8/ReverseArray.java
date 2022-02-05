package com.aquam.unit_8;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int size = array.length;
        int temp = 0;
        for (int i = 0; i < size / 2; i++) {
            temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));

    }
}