package com.aquam.unit_10;

public class ToyTrain implements Playable {

    String name;
    String color;

    public ToyTrain(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("The train is coming!");
    }

    public void doSound() {
        System.out.println("Ch ch ch");
    }

    @Override
    public String toString() {
        return "The " + getClass().getSimpleName() + " is called " + name + " and it is " + color;
    }
}
