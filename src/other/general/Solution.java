package other.general;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    		
    	int result=0;
    	
    	int[] input_array = s.stream().mapToInt(i->i).toArray();
        int[] f= new int[k];
        for (int i=0;i<input_array.length;i++)
        {
            f[input_array[i]%k]+=1;
        }
        
        
        result=Math.min(f[0],1);
        
        for(int i=1;i<(k/2)+1;i++)
        {
        	if(i!=(k-i))
        		result+=Math.max(f[i], f[k-i]);
        	else
        		result+=Math.min(f[i],1);
        	
        }
        
        return result;
   

    }

}

 public class Solution {
    public static void main(String[] args) throws IOException {
       
    	List<Integer> input = new ArrayList<Integer>();
    	input.add(1);
    	input.add(2);
    	input.add(3);
    	input.add(4);
    	input.add(5);
    	input.add(6);
    	input.add(7);
    	input.add(8);
    	input.add(9);
    	input.add(15);
    	input.add(16);
    	input.add(17);
    	input.add(21);
    	input.add(22);
    	input.add(24);

        int result = Result.nonDivisibleSubset(7, input);
        System.out.println();
        System.out.println(result);

        
    }
}
