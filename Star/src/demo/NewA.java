package demo;

public class NewA {
	
	NewA(int a)
	{
	 
		System.out.println("This is Constructor with para");
	}
	NewA()
	{
		System.out.println("This is Constructor");
		int i=10;
	}
	
	{
		System.out.println("this is java");
	}
	public static void main(String[] args) {
		
		NewA a= new NewA(10);
		NewA a1= new NewA();
		//a1.NewA.(i);
		
		
	}
}
