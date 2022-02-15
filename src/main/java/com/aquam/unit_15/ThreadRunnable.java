package com.aquam.unit_15;

import static com.aquam.unit_15.ThreadColor.ANSI_BLUE;

public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Thread Runnable");
    }
}
