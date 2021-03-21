package com.java.collectionpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String args[])
    {
        ArrayList<Integer> AL = new ArrayList<Integer>();
        AL.add(5);
        AL.add(6);
        AL.add(7);

        ArrayList<Integer> AL2 = new ArrayList<Integer>();
        AL2.add(1);
        AL2.add(2);
        AL2.add(3);

        boolean b1 = Collections.addAll(AL2,12,13,14);

        System.out.println(b1);
        System.out.println(AL2);

        String a[] = {"Mango","banana","peach"};


        Collections.swap(Arrays.asList(a),0,2);

        System.out.println(a);

        for (String i:a)
            System.out.println(i);

        boolean b = Collections.disjoint(AL,AL2);



        System.out.println(b);
    }
}
