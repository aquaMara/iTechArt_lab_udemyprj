package com.aquam.unit_12.Set;

import java.util.*;

public class HeavinglyBodyChallengeMain {

    private static Map<HeavenlyBodyChallenge.Key, HeavenlyBodyChallenge> solarSystem = new HashMap<>();
    private static Set<HeavenlyBodyChallenge> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBodyChallenge temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venice", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBodyChallenge tempMoon = new Moon("Moon", 27);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(temp.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        HeavenlyBodyChallenge pluto = new DwarfPlanet("Pluto", 248 );
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets:");
        for (HeavenlyBodyChallenge planet : planets) {
            // System.out.println("\t" + planet.getKey());
            System.out.println(planet);
        }

        HeavenlyBodyChallenge body = solarSystem.get(HeavenlyBodyChallenge.makeKey("Jupiter", HeavenlyBodyChallenge.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBodyChallenge jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey());
        }

        Set<HeavenlyBodyChallenge> moons = new HashSet<>();
        for (HeavenlyBodyChallenge planet : planets) {   // у каждой планеты set лунб поэтому через addAll добавляем каждую такую коллекцию
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for (HeavenlyBodyChallenge moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        for (HeavenlyBodyChallenge hb : solarSystem.values()) {
            System.out.println("\t" + hb);
        }



    }
}
