package com.aquam.unit_5;

public class SumChallenge {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                if (count == 5)
                    break;
            }
        }

        System.out.println("Sum " + sum);
    }
}
