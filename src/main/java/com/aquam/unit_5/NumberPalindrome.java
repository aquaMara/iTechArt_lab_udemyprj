package com.aquam.unit_5;

public class NumberPalindrome {

    public static void main(String[] args) {

        int iu = +6;
        System.out.println(iu);
        System.out.println(Math.abs(iu));

        System.out.println(isPalindrome(236));

        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(-5555));
        System.out.println(isPalindrome(123123));

        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(236));
        System.out.println(isPalindrome(2368));
        System.out.println(isPalindrome(2369));

    }

    public static boolean isPalindrome2(int number) {

        String numberString = String.valueOf(Math.abs(number)); // если нет +

        StringBuffer sbOriginal = new StringBuffer(numberString);
        String numberStringReversed = sbOriginal.reverse().toString();

        // !!! именно строки, тк StringBuffer mutable и меняет значение !! по адресу !!
        return numberString.equals(numberStringReversed);
    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int numberCopy = number;
        int reversedNumber = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;

        }

        return numberCopy == reversedNumber;
    }
}
