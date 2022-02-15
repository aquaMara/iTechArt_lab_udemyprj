package com.aquam.unit_15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Challenge12345 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345-678", 1000);

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

class BankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lock = new ReentrantLock();    // same lock for everybody
    }

    public void deposit(double amount) {

        lock.lock();
        try {
            balance += amount;
            System.out.println("After deposit, balance : " + balance);
        } finally {
            lock.unlock();  // to unlock for surely
        }

        /*
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                } finally {
                    lock.unlock();
                }
            } else
                System.out.println("Could not get the lock");

        } catch (InterruptedException e) {

        }
         */

    }

    public void withDraw(double amount) {
        lock.lock();
        try {
            balance -= amount;
            System.out.println("After withDraw, balance : " + balance);
        } finally {
            lock.unlock();  // to unlock for surely
        }
    }

    // only read - no need to sync
    public String getAccountNumber() {
        return accountNumber;
    }

    // only read - no need to sync
    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }


}

/*
        Thread p = new Thread() {
            @Override
            public void run() {
                account.deposit(300);
                account.withDraw(50);
            }
        };

        // ИЛИ

            Thread personOne = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300);
                account.withDraw(50);
            }
        });
*/

/*
    public void withDraw(double amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("After withDraw, balance : " + balance);
        }
    }

    // ИЛИ

    public synchronized void withDraw(double amount) {
        balance -= amount;
        System.out.println("After withDraw, balance : " + balance);
    }

    */