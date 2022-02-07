package com.aquam.unit_10;

public class Main {

    public static void main(String[] args) {

        Playground<Playable> field = new Playground<>();
        field.add(new ToyTrain("Violetta", "Red"));
        field.add(new ToyTrain("Lera", "Green"));
        field.add(new ToyPlane("Misha", "Yellow"));
        field.print();
    }
}
