package other.stringtest;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		
		String s1="MotherInLaw";
		String s2="HitlerWoman";
		
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Boolean B = Arrays.equals(c1,c2);
		
		
		
		System.out.println(B);
		
		
		

	}

}
