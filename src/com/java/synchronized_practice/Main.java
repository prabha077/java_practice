package com.java.synchronized_practice;

public class Main {

    public static void main(String args[])
    {
        final MathClass mathClass = new MathClass();

        final MathClassSyncMethod mathClassSyncMethod = new MathClassSyncMethod();

        //first Thread
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try{
                    mathClass.printNumbers(4);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try{
                    mathClassSyncMethod.printNumbers(4);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r,"ONE").start();
        new Thread(r,"TWO").start();

        new Thread(r2,"R2ONE").start();
        new Thread(r2,"R2TWO").start();
    }
}
