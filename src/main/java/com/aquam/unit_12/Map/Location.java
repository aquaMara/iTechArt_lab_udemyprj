package com.aquam.unit_12.Map;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    // возвращает копию exits с уже заданными значениями
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
