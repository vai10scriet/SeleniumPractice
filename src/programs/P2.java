package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P2 {

	public static  void main(String args[])
	{
		// To count number of  Characters
		String str="007 india india";
		
		if(str.length()==1)
		{
			System.out.println("Single digit String ");
			
		}
		
		if(str.isEmpty())
		{
			
			System.out.println("String is empty");
		}
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character che :ch)
		{
			if(map.get(che)==null)
			{
				
				map.put(che,1);
			}
			
			else
			{
				map.put(che,map.get(che)+1);
				
			}
			
		}
		
		
		Set<Entry<Character, Integer>> set=map.entrySet();
		for( Entry<Character, Integer> entry:set)
		{
			
			if(entry.getValue()>1)
			{
				
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
		
		
	}
	
	
	
	
	
}
