package methods.constructors;

public class Test2 {
	/*
	 What happens if we don't write constructor? 
	 Compiler automatically invokes a constructor which is internally invoked not seen by the user.
	 */
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		System.out.println("The 'byte' default value is : " + obj.a);
		System.out.println("The 'short' default value is : " + obj.b);
		System.out.println("The 'int' default value is : " + obj.c);
		System.out.println("The 'long' default value is : " + obj.d);
		System.out.println("The 'float' default value is : " + obj.e);
		System.out.println("The 'double' default value is : " + obj.f);
		System.out.println("The 'char' default value is : " + obj.g);
		System.out.println("The 'boolean' default value is : " + obj.h);
		
		
	}

}
