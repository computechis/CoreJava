package staticversuesnonstatic;

public class Demo {

	// instance variable or non static variable
	int a =10;
	public int b =20;
	
	// static variable
	static int c = 30;
	public static int d = 40;
	
	//instance method or non static method
	void m1() {
		System.out.println("It is a first userdefined instance method ");
	}
	public void m2() {
		System.out.println("It is a second userdefined instance method ");
	}
	// static method
	static void first() {
		System.out.println("It is a first userdefined static method ");
	}
	public static void second() {
		System.out.println("It is a second userdefined static method ");
	}
	
}
