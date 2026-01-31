package session11;

public class Counters {
	
	//Static varible example 2
	
	//class variables
	static int count = 0; // memory will be allocated only once
		
		Counters() //constructor without parameters
		{
			count++; //increment by 1. retain it's value
			System.out.println(count); //count = 1,2,3
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counters obj1 = new Counters();
		Counters obj2 = new Counters();
		Counters obj3 = new Counters();
	}

}
