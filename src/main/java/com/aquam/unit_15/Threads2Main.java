package com.aquam.unit_15;

import static com.aquam.unit_15.ThreadColor.ANSI_GREEN;

// interrupt + join
public class Threads2Main {

    public static void main(String[] args) {

        ThreadThread myThread = new ThreadThread();
        Thread anotherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Runnable Thread");
                try {
                    System.out.println("myThread terminated");
                    myThread.join();
                } catch (InterruptedException e) {
                    System.out.println("I cant wait, I was interrupted");
                }
            }
        });
        anotherThread.start();
        anotherThread.interrupt();

        myThread.start();

    }
}
