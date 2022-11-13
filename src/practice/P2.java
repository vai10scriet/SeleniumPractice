package practice;

public class P2 {
	int id; String name;
	public P2(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		
	}
	
	public static void main(String args[])
	{
		
	P2 obj= new P2(10,"Ram");
	obj.display();
		
	}

}
