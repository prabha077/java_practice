package other.general;

import java.util.Scanner;

public class ModulusOperation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println("I m scanner "+n);
		
		
		

		int a=4356;
		
		String s=String.valueOf(a);
		StringBuilder ss=new StringBuilder();
		ss.append(s);
	
		System.out.println(ss.reverse());
		System.out.println(s.length());
		
		int[] aa=new int[s.length()];
		
		for(int i=(s.length()-1);i>=0;i--)
		{
		
			aa[i]=a%10;
			a=a/10;
		}
		
		for (int j=0;j<aa.length;j++)
		{
			System.out.println(aa[j]);
		}
		

	}

}
