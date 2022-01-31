package com.aquam.unit_5;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(30, 18));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10)
            return -1;

        int min = first;
        int max = second;
        if (first > second) {
            min = second;
            max = first;
        }

        int divisor = 0;
        int remainder = -1;
        while (remainder != 0) {
            remainder = max % min;
            if (remainder == 0) {
                divisor = min;
                break;
            }
            max = min;
            min = remainder;
        }

        return divisor;
    }

    public static int getGreatestCommonDivisor2(int first, int second) {

        if (first < 10 || second < 10)
            return -1;

        int min = second;
        if (first < second) {
            min = first;
        }

        int divisor = 0;
        for (int i = min; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
                break;
            }
        }

        return divisor;
    }
}
