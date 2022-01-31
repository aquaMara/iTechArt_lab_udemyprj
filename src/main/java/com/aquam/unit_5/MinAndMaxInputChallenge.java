package com.aquam.unit_5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0, min = 0;
        int number = 0;

        while (true) {

            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < min)
                    min = number;
                if (number > max)
                    max = number;
            } else {
                break;
            }
            scanner.nextLine();
            System.out.println("Min : " + min + " Max : " + max);
        }
        scanner.close();
    }
}
