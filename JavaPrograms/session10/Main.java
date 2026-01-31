package session10;

public class Main {
	
	//constructor is called when created class object
	
	int x; //attribute of class
	
	Main() // constructor without parameter
	{
		
		//Initialise object
		
		x=10; //Initialise value of attribute
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj = new Main(); // This will call constructor
		System.out.println(obj.x); // print value of x 
		

	}

}
