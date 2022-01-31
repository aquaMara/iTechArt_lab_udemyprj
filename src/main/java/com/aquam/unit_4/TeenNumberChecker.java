package com.aquam.unit_4;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(isTeen(13));
        System.out.println(isTeen(100));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(16, 15, 17));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }

    public static boolean isTeen(int anyNumber) {
        return anyNumber >= 13 && anyNumber <= 19;
    }
}

