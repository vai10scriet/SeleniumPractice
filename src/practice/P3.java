package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P3 {
	
	public static void main(String args[])
	{
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put( 1,"Ram");
		map.put( 2,"Rahul");
		map.put( 3,"Raj");
		map.put( 4,"Seema");
		
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map);
		
		for( Object i:map.keySet())
		{
			
			System.out.println(map.get(i));
		}
		
		
		for( Entry<Integer, String> entry:map.entrySet())
		{
			
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
		
		Set<Entry<Integer, String>> set=map.entrySet();
	Iterator<Entry<Integer, String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry entry=  (Entry) itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		
	}
		
		
	}

}
