package other.toyota;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;



public class BalancedParanthesis_toyoto {
	
	
	public boolean isbalanced(String s)
	{	
		Stack stk=new Stack();
		int count=s.length();
		
		if(count<=1)
			return false;
		
		for(int i=0;i<count;i++)
		{
			
			char pos=s.charAt(i);
			
			if(pos=='{'||pos=='('||pos=='[')
				stk.push(s.charAt(i));
			
			if(stk.isEmpty())
			return false;
						
			char temp;
			
						switch(pos)
						{
						case '}': temp=(char)stk.pop(); if(temp=='('||temp=='[') return false;break;
						case ')': temp=(char)stk.pop(); if(temp=='{'||temp=='[') return false;break;
						case ']': temp=(char)stk.pop(); if(temp=='{'||temp=='(') return false;break;
						}
			
		}
		
		return (stk.isEmpty());	
	}

	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		
		while((line =in.readLine()) != null)
		{
			BalancedParanthesis_toyoto bp=new BalancedParanthesis_toyoto();
			
			boolean bbb=bp.isbalanced(line);
			
			System.out.println(bbb);
		}

	}

}
