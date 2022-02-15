package com.aquam.unit_15;

import static com.aquam.unit_15.ThreadColor.ANSI_PURPLE;
import static com.aquam.unit_15.ThreadColor.ANSI_RED;

public class ThreadThread extends Thread {

    @Override
    public void run() {
        // System.out.println(ANSI_RED + "Thread Thread with name " + currentThread().getName());
        System.out.println(ANSI_PURPLE + "Thread Thread");

        try {
            System.out.println("Thread Thread is sleeping");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread Thread was interrupted");
            return;
        }
    }
}
