package com.aquam.unit_4;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        // false
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        // true
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999)
            return false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 100 == 0 && year % 400 == 0)
                return true;
        }
        return false;

    }
}

/*
        if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
            if (year % 100 == 0 && year % 400 == 0)
                return true;
            if (year % 100 == 0 && year % 400 != 0)
                return false;
        } else {
            return false;
        }
*/



/*
public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else return true;
            } else return false;
        }
        return false;
    }
 */


