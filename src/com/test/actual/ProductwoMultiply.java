package com.test.actual;

public class ProductwoMultiply {

    long product(long i, long j)
    {
        long counter = Math.abs(i)>Math.abs(j) ? Math.abs(j) : Math.abs(i);

        long Operating_num = Math.abs(i)>Math.abs(j) ? Math.abs(i) : Math.abs(j);


        long result = 0l;

        while (counter>0)
        {
            result = result + Operating_num;
            --counter;
        }

        if(i<0 && j<0)
             return Math.abs(result);
        else if(i<0 || j<0)
            return -(Math.abs(result));
        else
            return Math.abs(result);
    }

    public static void main(String[] args) {

        long num1 = 3l;
        long num2 = -9l;
        long final_result = new ProductwoMultiply().product(num1,num2);

        System.out.println(final_result);


    }
}