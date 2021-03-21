package other.collectionstest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		

		List<String> L1=new ArrayList<String>();
		
		L1.add("prabha");
		L1.add("karan");
		L1.add("jaya");
		
		
		Iterator<String> i1=L1.iterator();
		
		while(i1.hasNext())
		{
			String next=i1.next();
			System.out.println(next);
		}
		
		
		
	}

}
