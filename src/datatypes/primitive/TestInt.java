package datatypes.primitive;

public class TestInt {

	public static void main(String[] args) {
		// int - 4 bytes (-214748364 to 2147483647)
		int a, b;
		a = 32768;
		b = -2147483648; 
		System.out.println("The A value is : " + a);
		System.out.println("The B value is : " + b);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The 'int' min value is : " + Integer.MIN_VALUE);
		System.out.println("The 'int' max value is : " + Integer.MAX_VALUE);

	}

}
