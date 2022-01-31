package com.aquam.unit_5;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));


    }

    public static int getLargestPrime(int number) {

        if (number < 2)
            return -1;

        int maxPrime = -1;
        boolean isPrime = true;

        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                for (int j = 2; j <= (long) Math.sqrt(i); j++) {  // for (int i = 2; i <= n / 2; i++)
                    if (i % j == 0) {
                        isPrime = false;    // хоть один раз поделилось на число -> уже точно не Prime -> break
                        break;
                    }
                }
                if (isPrime == true) {
                    maxPrime = i;   // нашли и сразу вышли
                    break;
                }
                isPrime = true;
            }

        }

        return maxPrime;
    }
}

/*
public static int getLargestPrime(int number) {
        if (number &lt; 2) {
            return -1;
        }
        int primeNumber = 0;

        for (int i = 2; i &lt;= number / 2; i++) {
            boolean isPrime = true;
            if (number % i == 0) {
                for (int j = 2; j &lt; i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                    if (!isPrime) {
                        break;
                    }
                }
                if (isPrime == true) {
                    primeNumber = i;
                }
            }
        }
        if (primeNumber == 0) {
            return number;
        }
        return primeNumber;
    }
 */