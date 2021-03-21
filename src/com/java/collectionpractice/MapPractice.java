package com.java.collectionpractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String args[])
    {
        Map<String, String> pm = new HashMap<String,String>();

        //pm.replaceAll();

        //Ineffective
//        if(!pm.containsKey("java"))
//        {
//            pm.put("Java", "Java Article");
//        }

        //To make it effective use below 2 ways. but computeIfAbsent it very effective
        pm.putIfAbsent("C++","JAMES");

        //pm.computeIfAbsent("C++",this::"jack");

        System.out.println(pm);

       // Reference : https://stackoverflow.com/questions/48183999/what-is-the-difference-between-putifabsent-and-computeifabsent-in-java-8-map
   // https://www.baeldung.com/java-map-computeifabsent
    }

}
