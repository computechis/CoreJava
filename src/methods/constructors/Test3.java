package methods.constructors;

public class Test3 {
	//Constructors are useful to initialize the variables in the class.
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	Test3(){
		System.out.println("----------Default constructor--------------");
		System.out.println("Object is created...");
		System.out.println("_____________________________________________");
		System.out.println("The 'byte' default value is : " + a);
		System.out.println("The 'short' default value is : " + b);
		System.out.println("The 'int' default value is : " + c);
		System.out.println("The 'long' default value is : " + d);
		System.out.println("The 'float' default value is : " + e);
		System.out.println("The 'double' default value is : " + f);
		System.out.println("The 'char' default value is : " + g);
		System.out.println("The 'boolean' default value is : " + h);
		System.out.println("_____________________________________________");
	}
	public static void main(String[] args) {
		Test3 obj = new Test3();
	}

}
