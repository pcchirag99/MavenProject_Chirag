package session7;

public class StringOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SubString Method
		String s = "WELCOME"; // Start index (W=0, E=1, L=2, C=3, o=4, M=5, E=6); End index ((W=1, E=2, L=3, C=4,o=5, M=6, E=7))
		
		//Substring "COME"
		System.out.println(s.substring(3, 7));
		
		//Substring "WEl"
		System.out.println(s.substring(0, 3));
		
		String a = "Do You Know";
		
		//Substring "YOU"
		System.out.println(a.substring(3, 6));
		
		//endsWith Method
		System.out.println(a.endsWith("Know"));
		
		//equals method for comparison two strings
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println("Is s1 equal s2: " + s1.equals(s2));
		
		//equal ignorecase method
		//System.out.println(s1.equalsIgnoreCase(s2));
		
		//concat method
		System.out.println(s1.concat(s2));
		
	}

}
