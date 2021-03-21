package com.java.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractices {

    public static void main(String args[])
    {
        List<Long> al = new ArrayList<Long>();
        al.add(7L);
        al.add(69L);
        al.add(6L);

        System.out.println(al.get(0));

        Collections.sort(al);

        System.out.println(al.get(0));


    }
}
