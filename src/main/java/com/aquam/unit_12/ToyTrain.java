package com.aquam.unit_12;

public class ToyTrain implements Comparable<ToyTrain> {

    private String name;
    private String color;
    private int numberOfThainCars;

    public ToyTrain(String name, String color, int numberOfThainCars) {
        this.name = name;
        this.color = color;
        this.numberOfThainCars = numberOfThainCars;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfThainCars() {
        return numberOfThainCars;
    }

    @Override   // -1 значит менять
    public int compareTo(ToyTrain o) {
        if (this.numberOfThainCars == o.numberOfThainCars)
            return 0;
        else if (this.numberOfThainCars < o.numberOfThainCars)
            return -1;  // этот объект < другого = -1 - менять
        else
            return 1;
    }

    @Override
    public String toString() {
        return "ToyTrain{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfThainCars=" + numberOfThainCars +
                '}';
    }
}
