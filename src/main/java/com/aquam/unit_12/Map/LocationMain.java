package com.aquam.unit_12.Map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LocationMain {

    private static Map<Integer,Location> locations = new HashMap<>();
    private static Map<Integer,Location> vocabulary = new HashMap<>();

    public static void main(String[] args) {

        locations.put(0, new Location(0, "You are sitting in front of a computer and learning Java"));
        locations.put(1, new Location(1, "You are in front of the long road"));
        locations.put(2, new Location(2, "Hill : You are in front of the mountain lake sitting at the shore"));
        locations.put(3, new Location(3, "Building : You are looking at the falling rain"));
        locations.put(4, new Location(4, "Valley : You are looking at the fire"));
        locations.put(5, new Location(5, "Forest : You are in the forest sitting in the tent"));

        // такую временную карту для каждого номера locations
        /*
        Map<String, Integer> tempExit = new HashMap<>();
        tempExit.put("W", 2);   // и тд
        locations.put(1, new Location(1, "You are in front of the long road", tempExit));
         */

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        // locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        // locations.get(2).addExit("S", 4);

        locations.get(3).addExit("W", 1);
        // locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        // locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("S", 1);
        // locations.get(5).addExit("Q", 0);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");


    }

    public void command() {
        Scanner scanner = new Scanner(System.in);
        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0)
                break;

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit : exits.keySet()) {
                System.out.println(exit + " ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String oneWord : words) {
                    if (vocabulary.containsKey(oneWord)) {
                        direction = String.valueOf(vocabulary.get(oneWord));
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
