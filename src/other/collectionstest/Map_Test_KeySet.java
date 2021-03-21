package other.collectionstest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Test_KeySet {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");
		
		Iterator ite=map.keySet().iterator();
		
		while(ite.hasNext())
		{
			System.out.println(map.get(ite.next()));
		}
		
		

		

	}

}
