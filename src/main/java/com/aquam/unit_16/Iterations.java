package com.aquam.unit_16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Iterations {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        // EXTERNAL ITERATION
        // normal for / enhanced for / iterator
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
        System.out.println();

        for (Integer i : values) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> iter = values.iterator(); // listIterator
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> listIter = values.listIterator(values.size() - 1);
        while (listIter.hasPrevious()) {
            System.out.print(listIter.previous() + " ");
        }
        System.out.println();

        System.out.println("*****************************************");

        // INTERNAL ITERATION

        values.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Anonymous class
        Consumer<Integer> c1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i + " ");
            }
        };
        values.forEach(c1);

        // we know that it is Consumer + it has only one method
        Consumer<Integer> c2 = (Integer i) -> {
            System.out.print(i + " ");
        };

        // we know that i is Integer
        Consumer<Integer> c3 = (i) -> System.out.print(i + " ");
        Consumer<Integer> c4 = i -> System.out.print(i + " ");

        values.forEach(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println("*****************************************");

        // METHOD REFERENCE - pass method as a parameter (not lambda expression)
        // obj out of System has a method println
        values.forEach(System.out::print);    // we are using method of an obj out
        System.out.println();
        values.forEach(Iterations::doubleIt);
        System.out.println();
        values.forEach(i -> doubleIt(i));   // lambda

    }

    public static void doubleIt(int i) {
        System.out.print(i * 2 + " ");
    }
}
