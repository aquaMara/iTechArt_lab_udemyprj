package com.aquam.unit_4;

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 3));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber == thirdNumber;
    }
}
