package demo;

public class Java8Tester {
	   public static void main(String args[]){
		      Java8Tester tester = new Java8Tester();
				
		      //with type declaration
		      MathOperation addition = (int a, int b) -> a + b;
				
		      //with out type declaration
		      MathOperation subtraction = (a, b) -> a - b;
				
		      //with return statement along with curly braces
		      MathOperation multiplication = (int a, int b) -> { return a * b; };
				
		      //without return statement and without curly braces
		      MathOperation division = (int a, int b) -> a / b;
				
		      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
				
		      //with parenthesis
		      
		     GreetingService gr=message1 ->
		     System.out.println(""+message1);
		      
		      GreetingService greetService1 = message ->
		      System.out.println("Hello " + message);
		      
		      //without parenthesis
		      GreetingService greetService2 = (message) ->
		      System.out.println("Hello " + message);
		      
		      
		      GreetingService gr1=message12 ->
		      System.out.println(message12);
		      
		      gr1.sayMessage("Parmeshwar");
				gr.sayMessage("i  have done this");
		      greetService1.sayMessage("This is java Class");
		      greetService2.sayMessage("This is Test Class");
		   }
			
		   interface MathOperation {
		      int operation(int a, int b);
		   }
			
		   interface GreetingService {
		      void sayMessage(String message);
		   }
			
		   private int operate(int a, int b, MathOperation mathOperation){
		      return mathOperation.operation(a, b);
		   }
		}