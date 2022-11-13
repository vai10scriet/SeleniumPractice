package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class P1 {
	
	public static void main(String args[])
	{
		// To Find duplicate element in String Array
		String[] str= {"Rohit","Ram","Rohit","Rahul","Rahul","Ram","Sita","Rahul"};
		
		Set<String> set=new HashSet<String>();
		for(String st :str)
		{
			
			if(set.add(st)==false)
			{
				
				System.out.println("Duplicate element is "+st);
			}
		}
		
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String st:str)
		{
			if(map.get(st)==null)
			{
				
				map.put(st,1);
				
			}
			
			else 
			{
				map.put(st,map.get(st)+1);
				
			}
			
			
		}
		
		
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		for(Entry<String, Integer> entry:entrySet)
			if(entry.getValue()>1)
			{
				
				System.out.println("Duplicate value is "+entry.getKey()+" "+ "Count is "+entry.getValue());
				
			
			}
		
		
	}
	

}
