package com.java.arraypractice;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[25];

        for(int i=0;i<25;i++)
        {
            arr[i]= new Random().nextInt(101);
        }

        for(int i=0;i<25;i++)
        {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);

        System.out.println("####################");

        for(int i=0;i<25;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
