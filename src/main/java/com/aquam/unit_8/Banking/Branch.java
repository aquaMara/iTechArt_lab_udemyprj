package com.aquam.unit_8.Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(initialTransaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer oneCustomer : customers) {
            if (oneCustomer.getName().equals(customerName))
                return oneCustomer;
        }
        return null;
    }
}
