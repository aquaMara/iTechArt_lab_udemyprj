package com.aquam.unit_4;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(18, 1.86));
        System.out.println(calcFeetAndInchesToCentimeters(157));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || !(inches >= 0 && inches <=12))
            return -1;

        double inc = feet * 12 + inches;
        double cm = inc * 2.54;
        return cm;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0)
            return -1;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
