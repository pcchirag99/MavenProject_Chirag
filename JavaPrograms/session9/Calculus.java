package session9;

public class Calculus {
	
	//Parameter lists example
	
	//modifier returntype nameofthemethod(Parameter list)
	//{
		//method body
	//}
	
	//method to sum two number
	static void sum(int a, int b)
	{
		//method body
		System.out.println("Sum of a and b is: " + (a+b));
		
	}
	
	//entry point of the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here we made static method so no need to create object for call method
		sum(2,5);
		
		

	}

}
