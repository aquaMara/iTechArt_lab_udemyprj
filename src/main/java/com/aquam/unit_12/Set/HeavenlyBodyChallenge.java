package com.aquam.unit_12.Set;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBodyChallenge {

    // private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyChallenge> satellites;
    // private final BodyTypes bodyType;
    private final Key key;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBodyChallenge(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        // this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        // this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBodyChallenge moon) {
        return satellites.add(moon);
    }

    // нет доступа к оригинальной HashSet, только к копии (в конструктор передали оригинал)
    public Set<HeavenlyBodyChallenge> getSatellites() {
        return new HashSet<>(satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;

        // if ((obj == null) || obj.getClass() != this.getClass()) return false;

        if (obj instanceof HeavenlyBodyChallenge) {
            HeavenlyBodyChallenge theObject = (HeavenlyBodyChallenge) obj;
            return this.key.equals(theObject.getKey());
        }

        //String objName = ((HeavenlyBodyChallenge) obj).getName(); return name.equals(objName);

        return false;
    }

    @Override
    public final int hashCode() {
        // return name.hashCode() + 23 + bodyType.hashCode();
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return "HeavenlyBodyChallenge " +
                "name : " + key.name
                + " bodyType : " + key.bodyType
                + " orbitalPeriod : " + orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private HeavenlyBodyChallenge.BodyTypes bodyType;

        public Key(String name, HeavenlyBodyChallenge.BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public HeavenlyBodyChallenge.BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (name.equals(key.getName()))
                return this.bodyType == key.getBodyType();
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 23 + this.bodyType.hashCode() ;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + name + '\'' +
                    ", bodyType=" + bodyType +
                    '}';
        }
    }
}
