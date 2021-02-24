package methods.voidtype;

public class Test3 {
	
	public void first() {
		System.out.println("---------first()---------");
		System.out.println("It is a first user defined method..");
		System.out.println(".............................");
		// To invoke a method with in a method
		// methodName();
		second();
	}

	public void second() {
		System.out.println("---------second()---------");
		System.out.println("It is a second user defined method..");
		System.out.println(".............................");
	}

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.first();
		
	}

}
