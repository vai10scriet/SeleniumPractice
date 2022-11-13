package practice;

public class P1 {
	int id;
	String name;
	static String college="BBDIT";
	
	public static void change()
	{
		
	college="IIT";
		
	}
	
	P1(int id, String name)
	{
		this.id=id;
		this.name=name;		
	}
	
	
	public void display() 
	{
		System.out.println(id+" "+name+" "+ college);
		
	}
	
	
	public static void main(String args[])
	{
		
	P1 obj=new P1(10,"Rahul");
	P1.change();
	obj.display();
		
	}

}
