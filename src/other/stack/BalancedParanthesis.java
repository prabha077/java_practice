package other.stack;

import java.util.Stack;



public class BalancedParanthesis {
	
	
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

	public static void main(String[] args) {
		
		BalancedParanthesis bp=new BalancedParanthesis();
		
		boolean bbb=bp.isbalanced("[()]{}{[()()]()}}}}");
		
		System.out.println(bbb);


	}

}
