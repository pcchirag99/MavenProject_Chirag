package session10;

public class MyClass {
	
	//attributes
	String car;
	int year;
	
	//constructor with parameter (Constructor name is same as the class name)
	
	MyClass(String carname, int yr)
	{
		//initialise attributes
		car = carname;
		year = yr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass("Etios", 2012); //create class object, this will call constructor of MyClass
		System.out.println(obj.car + " " + obj.year); //print car name and year
		

	}

}
