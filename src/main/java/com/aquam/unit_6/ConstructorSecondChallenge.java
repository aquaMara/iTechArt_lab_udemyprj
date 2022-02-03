package com.aquam.unit_6;

public class ConstructorSecondChallenge {

    private String name;
    private double creditLimit;
    private String email;

    public ConstructorSecondChallenge() {
        this("Name", 0, "email");
    }

    public ConstructorSecondChallenge(String name, double creditLimit) {
        this(name, creditLimit, "email");
    }

    public ConstructorSecondChallenge(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
