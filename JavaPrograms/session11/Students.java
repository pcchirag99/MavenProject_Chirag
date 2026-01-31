package session11;

public class Students {
	
	//class variables
	int roll; //non-static variables, unique for each student
	String studentName; //non-static variables, unique for each student
	
	static String colleageName = "Bharti Colleage"; //static variables --> Use static for this because colleage name is same for all the students. memory allocated only once during class loading. It have only one memory which is shared with each objects.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1 = new Students();
		student1.studentName = "Amit";
		student1.roll =101;
		
		System.out.println(student1.studentName + "," + student1.roll + "," + student1.colleageName);
		
		Students student2 = new Students();
		student2.studentName = "Sagar";
		student2.roll =102;
		
		System.out.println(student2.studentName + "," + student2.roll + "," + student2.colleageName);
		

	}

}
