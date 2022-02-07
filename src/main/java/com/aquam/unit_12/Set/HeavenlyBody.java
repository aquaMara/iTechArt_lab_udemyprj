package com.aquam.unit_12.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return satellites.add(moon);
    }

    // нет доступа к оригинальной HashSet, только к копии (в конструктор передали оригинал)
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    // equal по умолчанию это references, то есть ==
    // так можно в сет добавлять одинаковые по смыслу объекты, просто с разными ссылками
    // нужно переопределить
    // обязательно переопределить, если мой объект - ключ
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if ((obj == null) || obj.getClass() != this.getClass())
            return false;

        String objName = ((HeavenlyBody) obj).getName();
        return name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return name.hashCode() + 23;
    }
}
