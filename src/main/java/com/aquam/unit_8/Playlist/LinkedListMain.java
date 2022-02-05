package com.aquam.unit_8.Playlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Giraffe");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("******");
        linkedList.add("Snake");

        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());

        }



    }
}
