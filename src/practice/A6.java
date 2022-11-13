package practice;

public abstract class A6 implements Printable{


	//Convert upper case to lower case and vice versa in a string
	
	public static void main(String args[])
	{
		String s="Great Power";
		StringBuffer str= new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
				
			}
			
			
			else if(Character.isLowerCase(s.charAt(i)))
			{
				str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
				
			}
			
		}
		System.out.println(str);
	
		
	}
	

	

}
