package datatypes.primitive;

public class TestDefaultValues {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char val;
	boolean g;
	String str;
	TestDefaultValues tdf;
	public static void main(String[] args) {
		// To create an object : className referenceVariableName = new ClassName();
		TestDefaultValues obj = new TestDefaultValues();
		System.out.println("The 'byte' default value is : " + obj.a);
		System.out.println("The 'short' default value is : " + obj.b);
		System.out.println("The 'int' default value is : " + obj.c);
		System.out.println("The 'long' default value is : " + obj.d);
		System.out.println("The 'float' default value is : " + obj.e);
		System.out.println("The 'double' default value is : " + obj.f);
		System.out.println("The 'char' default value is : " + obj.val);
		System.out.println("The 'boolean' default value is : " + obj.g);
		System.out.println("The 'String' default value is : " + obj.str);
		System.out.println("The 'class' default value is : " + obj.tdf);

	}

}
