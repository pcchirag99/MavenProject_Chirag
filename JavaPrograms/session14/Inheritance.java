package session14;


// Single and multilevel inheritance examples


class A // Parent class 
{
	int a;
	void display() {
		System.out.println("class A: " + a);
	}
}

class B extends A { // class B is child class of A
	int b;
	void print() {
		System.out.println("class B: " + b);
	}
}

class C extends B { // class C is child class of B and A indirectly as B is child class of A
	int c;
	void printC() {
		System.out.println("class C: " + c);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A objA = new A();
		objA.a=10;
		objA.display();
		
		B objB = new B();
		objB.a=30; // class A
		objB.display(); // class A
		
		objB.b=40; // class A
		objB.print(); // class B
		
		C objC = new C();
		objC.a=10; // class A 
		objC.display(); // class A		
		objC.b=50; // class B
		objC.print(); // class B
		objC.c=45; // class C
		objC.printC(); // class C
		
		
		
		
		

	}

}
