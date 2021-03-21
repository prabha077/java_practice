package com.java.string;

public class SyncString {

    private static final String LOCK = "LOCK";

    public void dummy_module() throws InterruptedException
    {
        synchronized (LOCK)
        {
            this.work();
        }
    }

    private void work() {
        System.out.println("I am Work");
    }

}

