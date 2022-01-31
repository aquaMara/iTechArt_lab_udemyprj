package com.aquam.unit_4;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println(areEqualByThreeDecimalPlaces2(553456.24, 553456.76));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        String firstNumberStr = String.valueOf(firstNumber);
        String[] arr1 = firstNumberStr.split("\\.");
        String firstNumberBeginning = arr1[0];
        String firstNumberEnding = (arr1[1] + "00").substring(0,3);

        String secondNumberStr = String.valueOf(secondNumber);
        String[] arr2 = secondNumberStr.split("\\.");
        String secondNumberBeginning = arr2[0];
        String secondNumberEnding = (arr2[1] + "00").substring(0,3);

        return firstNumberBeginning.equals(secondNumberBeginning) && firstNumberEnding.equals(secondNumberEnding);
    }
    public static boolean areEqualByThreeDecimalPlaces2(double a, double b) {
        String formattedA = "" + a;
        String formattedB = "" + b;
        if (formattedA.length() < 4 || formattedB.length() < 4) {
            return formattedA.substring(0, formattedA.length()).equals(formattedB.substring(0, formattedB.length()));
        }
        return formattedA.substring(0, 5).equals(formattedB.substring(0, 5));
    }
}

/*
double d1 = 12.37556;
        System.out.println(d1);
        d1 *= 1000;
        System.out.println(d1);
        long d2 = (long) d1;
        System.out.println(d2);
 */

/*
public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        String formattedA = "" + a;
        String formattedB = "" + b;
        if (formattedA.length() < 4 || formattedB.length() < 4) {
            return formattedA.substring(0, formattedA.length()).equals(formattedB.substring(0, formattedB.length()));
        }
        return formattedA.substring(0, 5).equals(formattedB.substring(0, 5));
    }
 */