package com.aquam.unit_5;

public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        System.out.println("********");
        numberToWords(1000);
        System.out.println("********");
        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        int numberLength = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedNumberLength = getDigitCount(reversedNumber);
        int difference = numberLength - reversedNumberLength;

        int remainder = -1;
        if (number == 0)
            System.out.println("Zero");
        while (reversedNumber != 0) {
            remainder = reversedNumber % 10;
            switch (remainder) {
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    return;
            }

            reversedNumber = reversedNumber / 10;
        }

        while (difference > 0) {
            System.out.println("Zero");
            difference--;
        }

    }

    public static int reverse(int number) {

        int remainder = 0;
        int reversedNumber = 0;

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0)
            return -1;

        if (number == 0)
            return 1;

        int numberOfDigits = 0;
        while (number > 0) {
            numberOfDigits++;
            number = number / 10;
        }


        return numberOfDigits;
    }

    public static int reverse2(int number) {

        int remainder = 0;
        int reversedNumber = 0;
        boolean negFlag = false;
        if (number < 0) {
            number = Math.abs(number);
            negFlag = true;
        }

        while (number > 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        if (negFlag)
            reversedNumber *= -1;
        return reversedNumber;
    }

}
