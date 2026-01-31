package session9;

public class Calculations {

	//Non Static method example
	
		
		//modifier returntype nameofthemethod(Parameter list)
		//{
			//method body
		//}
		
		void printmessage() //non static method
		{
			//method body
			System.out.println("Welcome Java");
		}//exit of the method or end of the method
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call method using class object
		Calculations cal1 = new Calculations();
		cal1.printmessage();

	}

}
