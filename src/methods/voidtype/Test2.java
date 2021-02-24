package methods.voidtype;

public class Test2 {
	
	public void first() {
		System.out.println("---------first()---------");
		System.out.println("It is a first user defined method..");
		System.out.println(".............................");
	}

	public void second() {
		System.out.println("---------second()---------");
		System.out.println("It is a second user defined method..");
		System.out.println(".............................");
	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.first();
		obj.second();
	}

}
