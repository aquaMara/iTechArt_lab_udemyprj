package com.aquam.unit_10;

public class ToyPlane implements Playable {

    String name;
    String color;

    public ToyPlane(String name, String color) {
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

    @Override
    public void move() {
        System.out.println("The plane is flying!");
    }

    @Override
    public void doSound() {
        System.out.println("Bjjjj");
    }

    @Override
    public String toString() {
        return "The " + getClass().getSimpleName() + " is called " + name + " and it is " + color;
    }
}
