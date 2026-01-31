package session14;

// Hierarchical Inheritance example = where one is parent class and have more than one child class 

class parent 
{
	int a;
	void display()
	{
		System.out.println("class parent: " + a);
	}
}

class child1 extends A
{
	int b;
	void displaychild1()
	{
		System.out.println("class child1: " + b);
	}
}

class child2 extends A
{
	int c;
	void displaychild2()
	{
		System.out.println("class child2: " + c);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child1 obj1 = new child1();
		obj1.a=30; //parent
		obj1.b=35; //Child
		
		obj1.display(); //parent
		obj1.displaychild1();//child1
		
		child2 obj2 = new child2();
		obj2.a=1000; //parent
		obj2.c=8880; //child2
		
		obj2.display(); //parent
		obj2.displaychild2(); //child2
		
	}

}
