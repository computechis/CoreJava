package datatypes.primitive;

public class TestByte {

	public static void main(String[] args) {
		//byte - 1 byte (8 bits)(-128 to +127)
		/*
		 Syntax 1:
		 ---------------
		datatype variablename;
		variableName = value;
		 */
		byte a; // variable declaration
		a = 10; // Assigning the value
		System.out.println(a);
		System.out.println("The A value is : " + a);
		/*
		 Syntax 2:
		 ---------
		 datatype variablename = value;
		 */
		byte b = 127;
		System.out.println("The B value is : " + b);
		System.out.println("------------------------");
		System.out.println("The 'byte' min value is : " + Byte.MIN_VALUE);
		System.out.println("The 'byte' max value is : " + Byte.MAX_VALUE);
	}

}
