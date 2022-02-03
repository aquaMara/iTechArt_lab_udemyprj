package com.aquam.unit_6;

public class ConstructorsFirstChallenge {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public ConstructorsFirstChallenge() {
        this("000", 0, "Name", "email","0");
    }

    public ConstructorsFirstChallenge(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;   // не через сеттер, а напрямую
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long amount) {
        this.balance += amount;
    }

    public void withdrawFunds(long amount) {
        if (amount <= this.balance)     //  this.balance - amount > 0
            this.balance -= amount;
    }

}
