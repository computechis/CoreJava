package methods.constructors;

public class Test4 {
	//Constructors are useful to initialize the variables in the class.
	int a = 10; // Instance variable
	public Test4() {
		System.out.println("----------Default constructor--------------");
		System.out.println("Object is created...");
		
		System.out.println("The value is : " + a);
		System.out.println("_____________________________________________");
	}

	public static void main(String[] args) {
		Test4 obj = new Test4();

	}

}
