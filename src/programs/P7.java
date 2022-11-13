package programs;

public class P7 {

	//Converting lowercase to upper case and vice-versa
	public static void main(String args[])
	{
		String s="india";
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
