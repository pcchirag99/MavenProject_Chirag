package session11;

public class Student2 {
	
	//class variables
	int roll;
	String studentName;
	
	static String colleageName ="Bharti colleage";
	
	//Constructor
	Student2(int rollno, String name)
	{
		roll=rollno;
		studentName=name;
	}
	
	void display() 
	{
		System.out.println(studentName + "," + roll + "," + colleageName);
	}
	
	static void changeValue()
	{
		colleageName = "Sahjanand Colleage";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 obj1 = new Student2(101, "Rahul");
		Student2 obj2 = new Student2(102, "Shivani");
		
		obj1.display();
		obj2.display();
		changeValue();
		
		System.out.println("After colleage name change.");
		
		obj1.display();
		obj2.display();	

	}

}
