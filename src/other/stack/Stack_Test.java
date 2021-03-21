package other.stack;

import java.util.Stack;

public class Stack_Test {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
			Stack s=new Stack();
			
		for (int i=0;i<a.length;i++)
			s.push(a[i]);
		
		for (int i=0;i<a.length;i++)
			System.out.println(s.pop());
			

	}

}
