package session13;

public class mainmethodoverloading {

	void main(int x) // 1
	{
		System.out.println("x: " + x);
	}
	
	void main(double x) // 2
	{
		System.out.println("x: " + x);
	}
	
	void main(int x, int y) // 3
	{
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
	
	//entry point of the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainmethodoverloading obj = new mainmethodoverloading();
		obj.main(3);
		obj.main(7.5);
		obj.main(8, 10);
	}

}
