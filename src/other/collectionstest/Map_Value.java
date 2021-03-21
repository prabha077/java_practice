package other.collectionstest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Value {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");
		
		
		Iterator ite=map.values().iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}

	}

}
