package com.aquam.unit_15;

import static com.aquam.unit_15.ThreadColor.*;

public class ThreadsMain {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Main Thread");

        ThreadThread anotherThread = new ThreadThread();
        anotherThread.setName("thread from Thread");
        // если вызвать run, то он выполнится в текущем потоке, а start создаст новый поток
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_CYAN + "Anonymous Thread");
            }
        }.start();

        System.out.println(ANSI_GREEN + "Main Thread");

        Thread runnableThread = new Thread(new ThreadRunnable());
        runnableThread.start();

        Thread runnableThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_BLACK + "Runnable Anonymous Thread");
            }
        });
        runnableThread2.start();

        System.out.println(ANSI_RESET + "Main Thread");
    }
}
