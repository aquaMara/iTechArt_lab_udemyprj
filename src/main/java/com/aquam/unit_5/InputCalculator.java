package com.aquam.unit_5;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
                avg = Math.round(sum / counter);

            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
