package com.java.string;

public class Main {

    public static void main(String args[]) {
        SyncString sn = new SyncString();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    sn.dummy_module();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };

        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();


    }
}
