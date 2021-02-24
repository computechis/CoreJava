package oops.polymorphism.compilertime;

public class Calculator {
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition of two integers is : " + result);
	}
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Addition of three integers is : " + result);
	}
	public void add(int a, double b) {
		double result = a + b;
		System.out.println("Addition of integer and double is : " + result);
	}
	public void add(double a, int b) {
		double result = a + b;
		System.out.println("Addition of double and integer is : " + result);
	}
	public void add(double a, double b) {
		double result = a + b;
		System.out.println("Addition of two doubles is : " + result);
	}
	public void add(String a, String b) {
		String str = a + b;
		System.out.println("Concatination of two string is : " + str);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(20, 40, 60);
		cal.add(45, 1.2);
		cal.add(23.2, 100);
		cal.add(2.3, 1.2);
		cal.add("Selenium", "WebDriver");

	}

}
