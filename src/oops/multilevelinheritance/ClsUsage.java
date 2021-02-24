package oops.multilevelinheritance;

public class ClsUsage {

	public static void main(String[] args) {
		System.out.println("^^^^^^^^^^^^^One Class^^^^^^^^^^^^^");
		System.out.println();
		One o = new One();
		System.out.println("The A value is (One class)  : " + o.a );
		o.m1();
		System.out.println("^^^^^^^^^^^^^Two Class^^^^^^^^^^^^^");
		System.out.println();
		Two t = new Two();
		System.out.println("The A value is (One class) : " + t.a);
		System.out.println("The B value is (Two Clas) : " + t.b);
		t.m1();
		t.m2();
		System.out.println("^^^^^^^^^^^^^Three Class^^^^^^^^^^^^^");
		System.out.println();
		Three obj = new Three();
		System.out.println("The A value is (One class) : " + obj.a);
		System.out.println("The B value is (Two class) : " + obj.b);
		System.out.println("The C value is (Three class) : " + obj.c);
		obj.m1();
		obj.m2();
		obj.m3();
		

	}

}
