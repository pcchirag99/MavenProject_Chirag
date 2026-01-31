package session13;

public class MethodOverloading {
	
	// TODO Auto-generated method stub
	
			//In Method overloading, multiple methods can have
			//1. same name
			//2. different parameters numbers
			//3. different parameter data types
			
			void add (int a, int b) //1
			{
				System.out.println("1: " + (a+b));
			}
			
			void add (double a, double b) //2
			{
				System.out.println("2: " + (a+b));
			}
			
			void add (int a, double b) //3
			{
				System.out.println("3: " + (a+b));
			}
			
			void add (int a, int b, int c) //4
			{
				System.out.println("4: " + (a+b+c));
			}
			
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(2, 3);
		obj.add(2.3, 5.0);
		obj.add(5, 6.7);
		obj.add(8, 9, 10);
	}
}
