package session9;

public class maximumminimumexample {
	
	static int minimum(int a, int b)
	{
		if(a<b) // if a is smaller than b
			return a; // if condition true -->Exit
		else // if b is smaller than a
			return b; // Exit method if first condition is not true
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call the method
		System.out.println(minimum(12,8));

	}

}
