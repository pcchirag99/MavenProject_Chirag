package session8;

public class Students {
	
	//Using reference variable 
	
	//instance Variables - instance variable is inside in class but not in method
	
		String name;
		int rollno;
		
		//method to display information
		void displayInformation() // void is return type which indicate nothing gets return, we can also use int and double if we want any return for this = we can use return(); inside this method execution code if we want return any value
		{
			System.out.println("Name: " + name);
			System.out.println("Rollno: " + rollno);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class Object created inside main method
		
				Students student1 = new Students(); //Syntax --> classname objectreferencevariable = new classname();
				Students student2 = new Students();
		
		//initialise object/Store data to the object student1 using reference variable		
		
				student1.name = "Priya";
				student1.rollno =101;
				
				student2.name = "Rahul";
				student2.rollno =102;
				
		//Print information of student 1 and student 2
		student1.displayInformation(); //Priya information will be displayed
		student2.displayInformation(); //Rahul information will be displayed
				
	}

}
