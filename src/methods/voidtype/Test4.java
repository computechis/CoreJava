package methods.voidtype;

public class Test4 {
	
	public void first() {
		System.out.println("---------first()---------");
		System.out.println("It is a first user defined method..");
		System.out.println(".............................");
	}

	public void second() {
		first();
		System.out.println("---------second()---------");
		System.out.println("It is a second user defined method..");
		System.out.println(".............................");
	}

	public static void main(String[] args) {
		Test4 obj = new Test4();
	
		obj.second();
	}

}
