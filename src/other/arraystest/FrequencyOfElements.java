package other.arraystest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
				int[] a= {1,2,3,3,4,4,4,5,5,2,8,9};
				
				Map<Integer,Integer> m =new HashMap<Integer,Integer>();
				
				for (int i=0;i<a.length;i++)
				{
					if(m.containsKey(a[i]))
					m.put(a[i], m.get(a[i])+1);
					else
						m.put(a[i], 1);
				}
				
				Iterator<Map.Entry<Integer, Integer>> ite = m.entrySet().iterator();
						
						
				while(ite.hasNext())
				{
					
					Map.Entry<Integer, Integer> ee=ite.next();
					int k1=ee.getKey();
					int k2=ee.getValue();
					System.out.println("Key: "+k1+" Value: "+k2);
				}
				
		

	}

}
