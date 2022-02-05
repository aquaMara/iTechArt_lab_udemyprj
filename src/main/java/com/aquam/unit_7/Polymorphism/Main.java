package com.aquam.unit_7.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());

        Holden mitsubishi = new Holden(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
    }
}
