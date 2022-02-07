package com.aquam.unit_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> ascOrder = Arrays.asList(1, 3, 5, 8, 10, 12, 32, 86, 110, 115, 116);

        int[] arr = {2, 5, -1, 6, -3, 90};
        int[] arrAsc = mySortAscending(arr);
        for (int i = 0; i < arrAsc.length; i++) {
            System.out.print(arrAsc[i] + "   ");
        }
        System.out.println();
        System.out.println(myBinarySearch(arr, 6));

    }

    public static int[] mySortAscending(int[] arrOfNumbers) {

        for (int i = 0; i < arrOfNumbers.length; i++) {
            for (int j = 0; j < arrOfNumbers.length - 1; j++) {
                if (arrOfNumbers[j+1] < arrOfNumbers[j]) {
                    Integer temp = arrOfNumbers[j+1];
                    arrOfNumbers[j+1] = arrOfNumbers[j];
                    arrOfNumbers[j] = temp;
                }
            }
        }
        return arrOfNumbers;
    }

    public static int myBinarySearch(int[] arrOfNumbers, int searchedValue) {

        int[] arrAsc = mySortAscending(arrOfNumbers);

        int start = 0;
        int end = arrOfNumbers.length - 1;
        int middle = (start + end) / 2;
        int searchedIndex = -1;

        for (int i = start; i <= middle; i++) {     // или while (start <= end)

            middle = (start + end) / 2;

            if (arrAsc[middle] == searchedValue) {
                searchedIndex = middle;
                break;
            } else if (arrAsc[middle] > searchedValue) {     // середина книги больше числа - ищем с меньшей части книги
                end = middle - 1;
            } else if (arrAsc[middle] < searchedValue) {    // середина книги меньше числа - ищем с большей части книги
                start = middle + 1;
            } else if (end > start) {
                searchedIndex = -1;
                break;
            }

        }
        return searchedIndex;
    }

}
