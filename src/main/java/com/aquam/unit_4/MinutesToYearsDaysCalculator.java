package com.aquam.unit_4;

public class MinutesToYearsDaysCalculator {

    private static final String INVALID_METHOD_VALUE = "Invalid Value";

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0)
            System.out.println(INVALID_METHOD_VALUE);
        else {
            long days = minutes / 24 / 60;  //minutes = minutes % 24 % 60;
            long years = days / 365;
            days = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

/*
public static void printYearsAndDays(long minutes) {
        if (minutes &lt; 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + minutes / 525600 + " y and " + minutes % 525600 / 1440 + " d");
        }
    }
 */
