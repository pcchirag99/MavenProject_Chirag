package session7;

public class StringOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Java"; // H=0, e=1, l=2, l=3, 0=4, space=5, J=6, a=7, v=8, a=9
		
		//charAt Method
		System.out.println(s.charAt(2));
		
		//length() Method
		System.out.println(s.length());
		
		//toLowercase
		System.out.println(s.toLowerCase());
		
		//toUppercase
		System.out.println(s.toUpperCase());
		
		//replace method - 1(Single Word)
		//System.out.println(s.replace('a', 'i'));
		
		
		//replace method - 2(whole words)
		//System.out.println(s.replace("Java", "Python"));
		
		//Index of Method
		System.out.println(s.indexOf('J'));
		
		//SubString Method
		System.out.println(s.substring(4)); //Using o index 4 for getting string between o to ending
		
		//boolean isEmplty Method
		System.out.println(s.isEmpty()); // If we s="",+; do we get true because sting gets empty
	}

}
