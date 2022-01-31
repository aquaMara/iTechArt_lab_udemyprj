package com.aquam.unit_5;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {
        if (!(year >= 1 &&year <=9999))
            return false;

        if (year % 4 == 0) {
            if (year % 100 == 0)
                return year % 400 == 0;
            else
                return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        int days = 28;

        switch(month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = -1;
                break;
        }

        return days;

    }

    public static int getDaysInMonth2(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        switch(month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year))
                    return 29;
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

}
