package com.java.datatypes;

public class FloatPractice {

    public void met1(int a,float b)
    {
        System.out.println("I am 1");
    }

    public void met1(float a,float b)
    {
        System.out.println("I am 2");
    }

    public void met1(float a,double b)
    {
        System.out.println("I am 3");
    }


    public static void main(String args[])
    {
        FloatPractice f = new FloatPractice();
        f.met1(5f,5);
    }
}


// find out why?