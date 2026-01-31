package session8;

public class peoples {
	
	//Using Method
	
	String name;
	int rollno;
	
	//method to insert record
	void insertRecord(String peoplename, int peoplerollno)
	{
		name = peoplename;
		rollno = peoplerollno;
	}
	
	
	//method to display information
	void displayInformation()
	{
		//code to be executed
		System.out.println("Name: " + name);
		System.out.println("Rollno: " + rollno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		peoples people1 = new peoples();
		peoples people2 = new peoples();
		
		//initialse object or store data to the objects people1 and people2
		people1.insertRecord("Priya", 101);
		people2.insertRecord("Rahul", 102);
		
		//Print information of people1 and people2
		people1.displayInformation();
		people2.displayInformation();
	}

}
