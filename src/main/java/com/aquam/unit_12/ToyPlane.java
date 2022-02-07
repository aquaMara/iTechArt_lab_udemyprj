package com.aquam.unit_12;

public class ToyPlane {

    private String name;
    private String color;
    private int numberOfSeats;

    public ToyPlane(String name, String color, int numberOfSeats) {
        this.name = name;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "ToyPlane{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfSeats='" + numberOfSeats + '\'' +
                '}';
    }
}
