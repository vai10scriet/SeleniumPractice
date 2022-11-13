package programs;

public class P4 {
	
	public static void main(String args[])
	{
		
		//Palindrome String in java using Stringbuffer
		String str="radar";
		StringBuffer string=new StringBuffer(str);
		string.reverse();
		String Data=string.toString();
		if(str.toLowerCase().equals(Data.toLowerCase()))
		{
			System.out.println("String is pallindrome");
			
		}
		
		else
		{
			
			System.out.println("String is not pallindrome");
			
		}
		
	}

}
