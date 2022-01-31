package com.aquam.unit_5;

public class SumDigitsChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(128));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(8));

        System.out.println(sumDigits(1289));
        System.out.println(sumDigits2(1289));
        System.out.println(sumDigits(12389));
        System.out.println(sumDigits2(12389));
        System.out.println(sumDigits(112289));
        System.out.println(sumDigits2(112289));
    }

    // Моё решение!
    public static int sumDigits(int number) {

        if (number < 10)
            return -1;

        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        for (int i = 0; i < numberOfDigits; i++) {
            int additionalNumber = (int) (number / Math.pow(10, i));
            sum += additionalNumber % 10;
        }

        return sum;
    }
    public static int sumDigits2(int number) {

        if (number < 10)
            return -1;

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        return sum;
    }
}
