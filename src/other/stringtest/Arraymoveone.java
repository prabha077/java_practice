package other.stringtest;

import java.util.Arrays;
import java.util.Collections;

public class Arraymoveone {

	public static void main(String[] args) {
		
		
		Integer[] a= {8,9,7,-1,1,1,9,1};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		
		for (int i=0;i<a.length;i++)
		System.out.println(a[i]);
		

	}

}
