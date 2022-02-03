package com.aquam.unit_6;

public class Car extends Vehicle {

    private String type;
    private String drive;

    public Car(String brand, int maxSpeed, String type, String drive) {
        super(brand, maxSpeed);
        this.type = type;
        this.drive = drive;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
