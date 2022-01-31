package com.aquam.unit_5;

public class PrimeChallenge {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 28; i++) {
            if (isPrime(i)) {
                System.out.println("Prime found : " + i);
                count++;
                // or if (count == 3) break; there
            }
            if (count == 3)
                break;

        }
    }

    public static boolean isPrime(int n) {

        /*
        if (n == 1) // n > 1 !!!
            return false;
         */
        if (n <= 1) // n > 1 !!!
            return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {  // for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
