package session13;

public class Constructoroverloading {
	
	Constructoroverloading(int x) //1
	{
		System.out.println(x);
	}
	
	Constructoroverloading(double x) //2
	{
		System.out.println(x);
	}
	
	Constructoroverloading(double x, double y) //3
	{
		System.out.println("x: " + x);
		System.out.println("Y: " + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructoroverloading obj1 = new Constructoroverloading(5);
		Constructoroverloading obj2 = new Constructoroverloading(4.5);
		Constructoroverloading obj3 = new Constructoroverloading(6.7, 7.8);	
	}

}
