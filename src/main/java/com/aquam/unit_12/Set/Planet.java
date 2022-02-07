package com.aquam.unit_12.Set;

public class Planet extends HeavenlyBodyChallenge {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBodyChallenge moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON)
            return super.addSatellite(moon);
        else
            return false;
    }
}
