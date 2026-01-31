package session9;

public class returnmethodsumexample {
	
	//return method example
	
		//modifier returntype nameofthemethod(Parameter list)
		//{
			//method body
		//}
	
	//method to sum two number
	static int sum(int a, int b) //accepts two parameters (int a & int b)
	{
		return(a+b); //method exit
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = sum(2,5);
		
		System.out.println("Sum of a & b is: "+ result);

	}

}
