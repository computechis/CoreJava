package oops.polymorphism.compilertime;

public class DemoMain {

	
	public static void main(String val) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a string val- one parameter");
		System.out.println("The value is : " + val);
	}
	public static void main(String val1, String val2) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a string vals- two parameters");
		System.out.println("The first value is : " + val1);
		System.out.println("The second value is : " + val2);
	}
	public static void main(int[] arr) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a integer array..");
		for(int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.println();
	}
	public static void main(int a) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a integer value - one parameter..");
		System.out.println("The value is : " + a);
	}
	public static void main(int a, int b) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a integer value - two parameters..");
		System.out.println("The first value is : " + a);
		System.out.println("The second value is : " + b);
	}
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a string array..");
		for(String val : args)
		{
			System.out.print(val + "  ");
		}
		System.out.println();
	}
}
