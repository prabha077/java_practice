package other.practice;

import com.prabha.collectionstest.Map_Entry_Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmappractice {

    public static void main(String[] args)
    {
        String s="aabbggc";
        HashMap<Character,Integer> mp=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
           if(mp.containsKey(s.charAt(i)))
            {
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }

           else
           {
               mp.put(s.charAt(i),1);
           }

        }

        Iterator<Map.Entry<Character, Integer>> I = mp.entrySet().iterator();
        while(I.hasNext())
        {
            Map.Entry<Character,Integer> val = I.next();
           System.out.print(val.getValue()+""+val.getKey());
        }
    }
}
