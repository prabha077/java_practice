package com.java.collectionpractice;

import java.util.*;

public class TreeSetPractice {
    public static void main(String args[]) throws InterruptedException {
        SortedSet<Integer> ss = new TreeSet<Integer>();
        ss.add(62);
        ss.add(82);
        ss.add(33);
        System.out.println(ss);

            Thread.sleep(2000,1000);


            int j = 8790;
            String str = Integer.toString(j);
            int[] kk = new int[str.length()];

            for(int i=0;i<str.length();i++)
            {
                kk[i]=Integer.valueOf(str.charAt(i))-'0';
            }

            for(int k:kk)
        System.out.println(k);



        }






}
