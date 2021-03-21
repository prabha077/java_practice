package other.collectionstest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListTest {

	public static void main(String[] args) {
		
		List L1=new ArrayList();
		
		L1.add("prabha");
		L1.add("karan");
		L1.add("sara");
		L1.add("fresh");
		
		String s= (String) L1.get(2);
		
		System.out.println(s);
		
		System.out.println(L1.size());
		
		//ITERATOR TYPE
		
		System.out.println("\n ITERATOR TYPE");
		Iterator it= L1.iterator();
		
		while(it.hasNext())
		{
			String v1=(String) it.next();
			System.out.println(v1);
		}
		
		//FOR EACH LOOP
		
		System.out.println("\n FOR EACH LOOP TYPE");
		for(Object ob:L1)
		{
			System.out.println((String) ob);
		}
		
		
		//NORMAL FOR LOOP
		
		System.out.println("\n NORMAL FOR LOOP TYPE");
		for (int i =0;i<L1.size();i++)
		{
			System.out.println(L1.get(i));
		}
		
		L1.clear(); //To remove all elements
		
		List<String> lg1=new ArrayList<String>();
		
		lg1.add("Dinesh");
		lg1.add("harish");
		lg1.add("Arun");
		
		Iterator<String> ig1=lg1.iterator();
		
		//Generic iterator FOR LOOP

		System.out.println("\n Generic iteratot TYPE");
		while(ig1.hasNext())
		{
			System.out.println(ig1.next());
		}
		
		
		System.out.println("\n Generic for each loop");
		for (String sg:lg1)
		{
			System.out.println(sg);
		}
		

	}

}
