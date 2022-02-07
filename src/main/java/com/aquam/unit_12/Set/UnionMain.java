package com.aquam.unit_12.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * 1);
            cubes.add(i * i * 1);
        }

        System.out.println("cubes.size() " + cubes.size());
        System.out.println("squares.size() " + squares.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);    // уникальные элементы в union
        System.out.println("union.size() " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);  // все остальные элементы
        System.out.println("intersection.size() " + intersection.size());
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        // symmetric vs asymmetric difference
        // sym - all elems from two lists except those elems present in both (union without intersection)
        // asym - removeAll
        // ASYM
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrNature = {"all", "nature", "is", " but", "art", "to"};
        nature.addAll(Arrays.asList(arrNature));

        String[] arrDivine = {"to", "err", "is", " human", "forgive", "divine"};
        divine.addAll(Arrays.asList(arrDivine));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);    // 	all    but   art   nature - only unique + from nature

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff1.removeAll(nature);
        printSet(diff2);    // err    human   forgive   is   to   divine - only from divine

        // SYM
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);   // всё
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);   // всё общее удержали

        System.out.println("Symmetric");
        unionTest.removeAll(intersectionTest);   // всё общее убрали
        printSet(unionTest);    // all    but   art   err   nature    human   forgive   divine


        // test if one set is subset of another
        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is a subset of nature");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String elem : set) {
            System.out.print(elem + "   ");
        }
        System.out.println();
    }
}
