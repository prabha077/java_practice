package com.java.chargeb;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1,"prabha");
        hm.put(2,"karan");
        hm.put(6,"Raj");
        hm.put(4,"DC");
        

        for(Map.Entry m: hm.entrySet())
        {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }



        for(String s : hm.values())
            System.out.println(s);
    }
}
