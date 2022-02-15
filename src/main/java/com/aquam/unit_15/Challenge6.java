package com.aquam.unit_15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Challenge6 {

    public static void main(String[] args) {

        BankAccount2 account = new BankAccount2("12345-678", 1000);

        Thread personOne = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300);
                account.withDraw(50);
            }
        });
        Thread personTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withDraw(100);
            }
        });
        personOne.start();
        personTwo.start();

    }
}


class BankAccount2 {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lock = new ReentrantLock();    // same lock for everybody
    }

    public void deposit(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else
                System.out.println("Could not get the lock");

        } catch (InterruptedException e) {

        }
        System.out.println("Transaction status = " + status);
    }

    public void withDraw(double amount) {
        // local var -> threadsafe
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else
                System.out.println("Could not get the lock");

        } catch (InterruptedException e) {

        }
        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }


}
