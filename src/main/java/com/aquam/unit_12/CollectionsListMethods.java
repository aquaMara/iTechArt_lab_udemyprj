package com.aquam.unit_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsListMethods {

    public static void main(String[] args) {
        List<Integer> randomList = makeRandomList(10);
        printList("First list ", randomList);

        Collections.sort(randomList);
        printList("Asc ", randomList);
        Collections.reverse(randomList);
        printList("Reverse / Dsc ", randomList);

        Collections.shuffle(randomList);
        printList("After shuffle ", randomList);
        Collections.reverse(randomList);
        printList("Reverse / After shuffle ", randomList);

        System.out.println("Min " + Collections.min(randomList));

    }

    public static List<Integer> makeRandomList(int sizeOfList) {

        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            Integer randomNumber = Integer.valueOf((int) (Math.random() * 10));
            randomList.add(randomNumber);
        }

        return randomList;
    }

    public static void printList(String line, List<Integer> randomList) {
        System.out.println(line);
        for (int i = 0; i < randomList.size(); i++) {
            System.out.print(randomList.get(i) + "   ");
        }
        System.out.println();
    }
}
