package com.java.synchronized_practice;

public class MathClass {

    void printNumbers(int n) throws InterruptedException
    {
        synchronized (this)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println(Thread.currentThread().getName() + " :: "+ i);
                Thread.sleep(500);
            }
        }
    }

}
