package session12;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name, age & salary:");
		
		//create object of scanner class
		Scanner myObj = new Scanner(System.in);
		
		//String input
		String name = myObj.nextLine();
		
		//int input for age
		int age = myObj.nextInt();
		
		//double input for salary
		double salary = myObj.nextDouble();
		
		System.out.println("name is: " + name);
		System.out.println("age is: " + age);
		System.out.println("salary is: " + salary);
		
		

	}

}
