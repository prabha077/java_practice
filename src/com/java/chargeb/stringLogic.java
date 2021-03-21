package com.java.chargeb;

import java.util.Scanner;

public class stringLogic {

    public static void main(String[] args) {

        String s = "wwwwbbbaaacw";

        for (int i = 0; i < s.length(); i++) {

            // Counting occurrences of s[i]
            int count = 1;
            while (i + 1 < s.length()
                    && s.charAt(i)
                    == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i)
                    + "" + count + " ");
        }


    }

}