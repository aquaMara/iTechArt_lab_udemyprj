package com.aquam.unit_8.Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch == null) {
            branches.add(new Branch(branchName));   // !!!!!!!!!!!!!!!!!!!!!!! - branches.add(currentBranch) - Нет;
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch != null)
            return currentBranch.newCustomer(customerName, initialTransaction);

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null)
            return findBranch(branchName).addCustomerTransaction(customerName, initialTransaction);

        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch oneBranch : branches) {
            if (oneBranch.getName().equals(branchName))
                return oneBranch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null) {
            ArrayList<Customer> allCustomers = findBranch(branchName).getCustomers();
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < allCustomers.size(); i++) {
                System.out.println("Customer: " + allCustomers.get(i).getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> allTransactions = allCustomers.get(i).getTransactions();
                    for (int j = 0; j < allTransactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + allTransactions.get(j));
                    }

                }
            }

            return true;
        }
        return false;
    }
}
