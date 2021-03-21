package other.collectionstest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_Entry_Set {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");
		
		for(Map.Entry<String,String> mm:map.entrySet())
		{
			System.out.println(mm.getKey()); 
			System.out.println(mm.getValue());
		}
		
		
			String s1="madam";
			String s2="madam";
			
			 char[] string1 = s1.toCharArray();  
	            char[] string2 = s2.toCharArray();  
	  
	              
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	            
	            System.out.println(string1);
	            System.out.println(string2);
				

	}

}
