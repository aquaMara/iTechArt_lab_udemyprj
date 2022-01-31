package com.aquam.unit_5;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 0, 10));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        for (int i = bigCount; i >= 0; i--) {
            for (int j = smallCount; j >= 0; j--) {
                if (i * 5 + j * 1 == goal)
                    return true;
            }
        }

        return false;
    }
}

/*
public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount &lt; 0 || smallCount &lt; 0 || goal &lt; 0) {
            return false;
        }
        int bigCountWeight = 5;
        if (bigCount == 0) {
            return smallCount &gt;= goal;
        }
        if (goal &gt; bigCount * bigCountWeight + smallCount) {
            return false;
        }
        if (goal % bigCountWeight == 0) {
            if (goal &lt;= bigCountWeight * bigCount) {
                return true;
            } else {
                return goal &lt;= bigCountWeight * bigCount + smallCount;
            }
        }
        for (int i = 1; i &lt; bigCount; i++) {
            if (smallCount &gt;= goal % (i * bigCountWeight)) {
                return true;
            }
        }
        return false;
    }
 */
