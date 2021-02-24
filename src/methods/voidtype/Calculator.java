package methods.voidtype;

public class Calculator {
	int x = 10; // Instance variable
	//double x =23.4; // duplicate instance variable
	//add, sub, mul, div (2 values)
	public void add(int a, int b) {
		int result; // local variables
		result = a + b;
		System.out.println("The addition of two integers is : " + result);
	}
	public void sub(double a, double b) {
		double result = a - b;
		System.out.println("The subtraction of two doubles is : " + result);
	}
	public void mul(int a, int b) {
		int result = a * b;
		System.out.println("The multiplication of two integers is : " + result);
	}
	public void div(int a, int b) {
		System.out.println("The division of two integers is : " + (a/b));
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.sub(22.5, 10);
		cal.mul(25, 5);
		cal.div(50, 2);

	}

}
