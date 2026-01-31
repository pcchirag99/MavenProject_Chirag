package Session2;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators (+,-,*,/,%,++ and --)
		int a =10;
		int b =5;
		
		System.out.println("----------Arithmetic Operators----------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// ++ Increment Operator
		System.out.println(a++); //print --> 10 and than If run a got 11(Post and Pre Increment)
		System.out.println(a);
		
		//-- Decrement Operator
		System.out.println(a--); //print -- > 10 and than If run a got 9 Post and Pre Increment) 
		System.out.println(a);
		
		//Relational Operators/Comparison Operators (==,!=,>,<,>=,<=)
		System.out.println("----------Relational Operators/Comparison Operators----------");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b); //Here two condition one is > and = for true one should be correct
		System.out.println(a<=b); //Here two condition one is > and = for true one should be correct
		
		//Assignment Operators - If want to assign value like a=b
		a=b;
		
		System.out.println("----------Assignment Operators----------");
		System.out.println(a);
		
		//Logical Operators (&&,||,!)
		
		System.out.println("----------Logical Operators----------");
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!y);
		
		//Conditional operator / ternary operator - Mostly use for instead of if and else (?:)
		//Syntax - variable = (condition) ? expression1 : expression2
		
		a=9;
		b=10;
		int minimum = a<b?a:b;
		
		System.out.println("----------Conditional Operators----------");
		System.out.println(minimum);
	}
}
