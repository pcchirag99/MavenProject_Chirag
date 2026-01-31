package session5;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare and instantiate [Syntax = dataType [] arrRefVar = new datatype[size]; ]
		int [] roll = new int[5];
		
		//insert value in array 
		roll[0] = 12; //1st element
		roll[1] = 13; //2nd element
		roll[2] = 14; //3rd element
		roll[3] = 34; //4th element
		roll[4] = 43; //5th element
		
		//Second method for declare/Instantiate and insert value in one line: int [] roll = {12,13,14,34,43};
		
		
		//Print size of array
		System.out.println("Size of the array:" +roll.length);
		
		//Read value from array
		System.out.println("Value of the 4th element: " + roll[3]);
		
		//Read all the value of array
		for (int i=0; i<roll.length; i++)
		{
			System.out.println(roll[i]);
		} 
		
		// for each loop - enhanced loop or advanced for loop/  which is the use for the array in mostly.
		for (int i:roll)
		{
			System.out.println(i);
		}
		
		
		
	}
}
