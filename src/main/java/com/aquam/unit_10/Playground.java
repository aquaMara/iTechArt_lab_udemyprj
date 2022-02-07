package com.aquam.unit_10;

import java.util.ArrayList;
import java.util.List;

public class Playground <T extends Playable> {

    private List<T> toys;

    public Playground() {
        this.toys = new ArrayList<>();
    }

    public void add(T toy) {
        toys.add(toy);
    }

    public void remove(T toy) {
        toys.remove(toy);
    }

    public void print() {
        for (T oneT : toys) {
            System.out.println(oneT);
        }
    }

}
