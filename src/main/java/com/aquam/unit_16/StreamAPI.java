package com.aquam.unit_16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// functional programming
// Intermediate (filter, map) + Terminate (findFirst, forEach) methods
/*
        filter(i -> i % 5 == 0) - оставляет только элементы из условия, те убирает лишнее (тут оставляет все элементы, которые делятся на 5)
        map(i -> i * 2) - преобразует элементы по условию (тут удваивает каждый элемент)
        reduce(0, (i, j) -> i + j) - оставляет одно значение по условию (тут сумма всех элементов)
*/
public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> vals = Arrays.asList(1, 2, 3, 4, 5, 6);

        // mutation (for variable result) - system is unstable, can't achieve concurrency
        // 1
        int result = 0;
        for (Integer i : vals) {
            result = result + i * 2;
        }
        System.out.println(result);
        System.out.println("************************");

        // no mutation
        // 2 - convert collection into stream
        // map takes Function interface or Lambda
        // for every i -> make i * 2
        // and find the addition of all numbers - reduce (BinaryOperator)
        System.out.println(vals.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
        System.out.println("************************");

        List<Integer> vals2 = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        /*
        Integer result2 = vals2.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, (i, j) -> i + j);
        System.out.println("result2 >> " + result2);
         */

        /*
        // Optional - if there is no such value - no error
        Optional<Integer> result3 = vals2.stream()
                                         .filter(i -> i % 5 == 0)
                                         .map(i -> i * 2)
                                         .findFirst();
        System.out.println("result3 >> " + result3);
         */

        /*
        // orElse - if no value, print
        Integer result4 = vals2.stream()
                               .filter(i -> i % 5 == 0)
                               .map(i -> i * 2)
                               .findFirst()
                               .orElse(0);
        System.out.println("result4 >> " + result4);
         */

        // filter, map - lazy evaluation : only tell that they have done smth, and really do when we write not lazy operators
        // findFirst - terminal operation - not lazy
        Integer result5 = vals2.stream()
                .filter(StreamAPI::isDivisible)
                .map(StreamAPI::mapDouble)
                .findFirst()
                .orElse(0);
        System.out.println("result5 >> " + result5);
        // Console:
        // in isDivisible 12
        // in isDivisible 20
        // in mapDouble 20
        // result5 >> 40






    }

    public static boolean isDivisible(int i) {
        System.out.println("in isDivisible " + i);
        return i % 5 == 0;
    }
    public static int mapDouble(int i) {
        System.out.println("in mapDouble " + i);
        return i * 2;
    }
}

/*
        System.out.println("************************");
        // 1
        Stream s = vals.stream();

        // 2
        // map takes the value and converts it in what I need (takes Function)
        // Function - what to take, what to return
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
        // map took Function and returned Stream
        Stream s1 = s.map(function);

        // 3
        // reduce takes an obj of BinaryOperator and returns int, applies to Stream
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        Integer resultOfReduce = (Integer) s1.reduce(0, binaryOperator);

        // 4
        System.out.println(resultOfReduce);
 */

/*
        System.out.println("************************");

        Stream stream = vals.stream();
        Stream stream1 = stream.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        });
        Integer resultOfReduce2 = (Integer) stream1.reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        System.out.println("resultOfReduce2 >> " + resultOfReduce2);

 */

/*
        Stream<Integer> stream = vals.stream();
        Stream<Integer> stream1 = stream.map((integer) -> integer * 2);
        Integer resultOfReduce2 = (Integer) vals.stream().map((integer) -> integer * 2).reduce(0, (integer1, integer2) -> integer1 + integer2);

 */

/*
        // add all the elems divisible by 5
        // filter takes Predicate which leaves values using this criteria : i % 5 == 0
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 5 == 0;
            }
        };

        Integer result2 = vals2.stream()
                .filter(predicate)  // i -> i % 5 == 0
                .reduce(0, (i, j) -> i + j);
        System.out.println("result2 >> " + result2);

 */