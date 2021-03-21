package other.toyota;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.lang.Object;

public class Picking_Children {
	
	public void playerslist(int n,int k)
	{
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		Integer val=-1;
		for(int i=0;i<n;i++)
		{
			int l=0;
			while(l<k)
			{
				val++;
				if(val>n-1)
					val=0;
				if(!(s.contains(val)))
						l++;
			}
			
			System.out.println(val);
			s.add(val);
			
//			if(s.size()==n)
//				break;
		}
		
	}

	public static void main(String[] args)  throws IOException {

			Picking_Children pn=new Picking_Children();
			pn.playerslist(10, 3);

	}

}
