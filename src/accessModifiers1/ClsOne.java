package accessModifiers1;

public class ClsOne {
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//								Access Modifiers			Scope			
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public int a = 10;				// public				Entire project
	private int b =20;				// private				With in a class
	protected int c = 30;			// protected			With in the package and another package(inheritance)
	int d = 40;						// default				With in the package
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void m1() {
		System.out.println("It is 'public' access specifier method..");
	}
	private void m2() {
		System.out.println("It is 'private' access specifier method..");
	}
	protected void m3() {
		System.out.println("It is 'protected' access specifier method..");
	}
	void m4() {
		System.out.println("It is 'default' access specifier method..");
	}
	public static void main(String[] args) {
		ClsOne obj = new ClsOne();
		System.out.println("The 'public' access specifier of A value is : " + obj.a);
		System.out.println("The 'private' access specifier of B value is : " + obj.b);
		System.out.println("The 'protected' access specifier of C value is : " + obj.c);
		System.out.println("The 'default' access specifier of D value is : " + obj.d);
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
