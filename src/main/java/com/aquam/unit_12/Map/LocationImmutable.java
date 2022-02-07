package com.aquam.unit_12.Map;

import java.util.HashMap;
import java.util.Map;
// Fully immutable classes
// no setters
// fields final + private
// final class - so no override
// no methods to change fields
// не давать ссылки на mutable obj
//  public Map<String, Integer> getExits() {
//        return exits;     - ссылка на мьютабл
//    }

public class LocationImmutable {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public LocationImmutable(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null)
            this.exits = new HashMap<>(exits);
        else
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

    // addExit() - не нужен, так как всё через конструктор
}
