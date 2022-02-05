package com.aquam.unit_5;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 6) {
            System.out.println("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Value");
                // можно тут
                scanner.nextLine(); // убрать лишнюю строку // почему тут
            }

        }
        System.out.println("Sum : " + sum);
        scanner.close();
    }
}
