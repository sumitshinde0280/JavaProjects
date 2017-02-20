package demo;
class Derived extends Base {
    public   void display() 
    	{
         System.out.println("Static or class method from Derived");
    	}
    public void print() 
    {
         System.out.println("Non-static or Instance method from Derived");
   }

}


public class Sumit {
    public static void main(String args[ ])  
    {
       Base obj1 = new Derived();
       obj1.display();  
        
       obj1.print();     
    }
}