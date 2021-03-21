package other.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BitSet_Test {

	public static void main(String[] args) {
		

		int a=4;
		int b=3;
		
		int c = a&b;
		
		System.out.println(c);

		System.out.println(Integer.bitCount(8));
		
		Integer[] aa= {1,3,4,5,6,7};
		
		List<Integer> L=new ArrayList<Integer>(Arrays.asList(aa));
		
		L.add(8);
		
		Iterator<Integer> ite=L.iterator();
		
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		
		
		
		
	}

}
