package methods.voidtype;

public class Test1 {
	// public -> AccessSpecifier, void -> return type, first() -> methodName
	public void first() {
		System.out.println("---------first()---------");
		System.out.println("It is a first user defined method..");
		System.out.println(".............................");
	}
	public static void main(String[] args) {
		// To create an instance : ClassName referenceVar = new ClassName();
		Test1 obj = new Test1();
		//To invoke the methods : referenceVar.methodName();
		obj.first();
		obj.first();
		obj.first();
		obj.first();

	}

}
