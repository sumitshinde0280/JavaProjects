package demo;

  
public class ABC 
{  
	void m1()
	{
		System.out.println();
	}
  public static void main(String[] args)  
  {  
    Test t = new Test()  
     {  
       public void greet()  
       {  
         System.out.print("\nHi this is java\n");  
       }  
    };  
    t.greet();  
    }  
} 