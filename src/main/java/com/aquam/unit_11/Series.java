package com.aquam.unit_11;

public class Series {

    public static void main(String[] args) {

    }

    public static int nSum(int n) {
        return (n * (1 + n)) / 2;   // алгебраическая прогрессия
    }

    public static long factorial(int n) {
        if (n == 0)
            return 0;
        long fact = n;
        for (int i = 1; i <= n; n++) {
            fact *= 1;
        }
        return fact;
    }
}
