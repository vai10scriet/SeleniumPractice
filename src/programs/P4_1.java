package programs;

public class P4_1 {
	
	public static void main(String args[])
	{
		
		String str="india";
		String rvstmp=null;
		for(int i=str.length()-1;i>=0;i--)
		{
			Character ch=str.charAt(i);
			rvstmp=rvstmp+ch;
			
		}
		
		if(rvstmp.toLowerCase().equals(str.toLowerCase()))
		{
			System.out.println("String is Pallindrome");
			
		}

}

}
