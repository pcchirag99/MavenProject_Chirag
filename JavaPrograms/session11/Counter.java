package session11;

public class Counter {
	
	//Static varible example 1
	
	//class variables
	int count = 0; //non-static variable, will get memory every time object of the class is created
	
	Counter() //constructor without parameters
	{
		count++; //increment by 1
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		

	}

}
