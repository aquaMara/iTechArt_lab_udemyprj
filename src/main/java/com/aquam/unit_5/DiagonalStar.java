package com.aquam.unit_5;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return; // void - нормально ли так или лучше else
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                if (j == 1 || j == number || i == 1 || i == number) // границы
                    System.out.print("*");
                else if (i == j)    // диагональ верхний левый угол - нижний правый угол
                    System.out.print("*");
                else if (i + j == number + 1)    // диагональ верхний правый угол - нижний левый угол
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printSquareStar2(int number) {   // Тоже рисунки, только другие

        if (number < 5) {
            System.out.println("Invalid Value");
            return; // void - нормально ли так или лучше else
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == j || i + j == number + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}

/*
public static void printSquareStar(int number) {
        if (number &lt; 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i &lt; number; i++) {
                for (int j = 0; j &lt; number; j++) {
                    if (j == 0 || j == number - 1 || i == 0 || i == number - 1 || j == i || i == number - j - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
 */