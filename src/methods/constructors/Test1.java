package methods.constructors;

public class Test1 {
	/*
	 Constructor:
	 It is a method which is having same name as class name and it doesn't have return type.
	 There are two types of constructors:
	 ------------------------------------
	 1) Default constructor or Zero arg constructor
	 2) Parameterized Constructor or one arg constructor or two arg constructor 
	 Purpose:
	 Constructors are invoked automatically whenever we create an object.
	 */
	public Test1() {
		System.out.println("----------Default constructor--------------");
		System.out.println("Object is created...");
		System.out.println("_____________________________________________");
	}
	public void m1() {
		System.out.println("----------m1()-----------");
		System.out.println("It is a user defined method");
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
		
		Test1 obj = new Test1(); 
		obj.m1();
		//Test1 obj2 = new Test1(); 
	}

}
