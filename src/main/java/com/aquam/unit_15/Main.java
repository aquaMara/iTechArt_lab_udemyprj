package com.aquam.unit_15;

// потоки : общая куча, собственный стек
public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        // передаём объект потокам
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

// threads interference - потоки хотят доступ к одному объекту

class Countdown {

    // потоки не имеют доступ к стеку друг друга, но имеют доступ к общей куче
    // локальные переменные хранятся в стеке, те у каждого потока своя локал переменная (for(int i=10; i > 0; i--))
    // instance vars - в куче, те если потоки работают с одним объектом, то всё общее (private int i;)
    private int i;  // одна на двоих

    // public synchronized void doCountdown()
    public void doCountdown() {
        String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        // одна на один поток for(int i=10; i > 0; i--) {
        // synchronized (color) {  // только один поток захватывает цвет, но локальная переменная одна - не использовать synchronized + локальные переменные
        synchronized (this) {   // объект, поэтому работает
            for(i=10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}