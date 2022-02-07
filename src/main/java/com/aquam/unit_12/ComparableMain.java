package com.aquam.unit_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// -1 значит менять
public class ComparableMain {

    public static void main(String[] args) {
        ArrayList<ToyTrain> toyTrains = new ArrayList<>();
        toyTrains.add(new ToyTrain("Violetta", "Red", 8));
        toyTrains.add(new ToyTrain("Ron", "Pink", 9));
        toyTrains.add(new ToyTrain("Daria", "Blue", 2));
        toyTrains.add(new ToyTrain("Emma", "Gold", 3));
        toyTrains.add(new ToyTrain("Mike", "Purple", 5));
        printList(toyTrains);
        Collections.sort(toyTrains);
        printList(toyTrains);
        // Comparable - Comparable<ToyTrain> нужно имплемент,
        // чтобы в этом классе  реализовать метод public int compareTo(ToyTrain o),
        // где -1 будет значить "меняем местами" и с момощью этого метода - сортировка

        // Comparator - не нужно имплемент для сортировки объектов,
        // можно создать его прямо в мэйн через анонимный класс + метод compare,
        // где -1 = меняем местами <
        Comparator<ToyPlane> toyPlaneComparator = new Comparator<ToyPlane>() {
            @Override
            public int compare(ToyPlane o1, ToyPlane o2) {
                if (o1.getNumberOfSeats() == o2.getNumberOfSeats())
                    return 0;
                else if (o1.getNumberOfSeats() < o2.getNumberOfSeats())
                    return -1;
                else
                    return 1;
            }
        };
        ArrayList<ToyPlane> toyPlanes = new ArrayList<>();
        toyPlanes.add(new ToyPlane("Violetta", "Red", 80));
        toyPlanes.add(new ToyPlane("Ron", "Pink", 90));
        toyPlanes.add(new ToyPlane("Daria", "Blue", 26));
        toyPlanes.add(new ToyPlane("Emma", "Gold", 38));
        toyPlanes.add(new ToyPlane("Mike", "Purple", 58));
        printList(toyPlanes, 5);
        toyPlanes.sort(toyPlaneComparator);
        printList(toyPlanes, 5);

    }

    public static void printList(List<ToyTrain> randomList) {

        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get(i));
        }
        System.out.println();
    }

    public static void printList(List<ToyPlane> randomList, int a) {

        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get(i));
        }
        System.out.println();
    }
}
