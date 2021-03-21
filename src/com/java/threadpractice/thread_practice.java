package com.java.threadpractice;

public class thread_practice implements Runnable {

    Thread t;

    void newthread() {
        t = new Thread(this, "New Thread");
        t.start();
    }

    public void run() {
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
    }

}

    class multithread_programming {

        public static void main(String[] args) {

                new thread_practice().newthread();

            }

        }

        // Reason Why?



