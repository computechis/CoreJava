package accessModifiers2;

import accessModifiers1.ClsOne;

public class ClsFour extends ClsOne {

	public static void main(String[] args) {
		ClsFour fObj = new ClsFour();
		System.out.println("The 'public' access specifier of A value is : " + fObj.a);
//		System.out.println("The 'private' access specifier of B value is : " + fObj.b);
		System.out.println("The 'protected' access specifier of C value is : " + fObj.c);
//		System.out.println("The 'default' access specifier of D value is : " + fObj.d);

		fObj.m1();
//		fObj.m2();
		fObj.m3();
//		fObj.m4();
	}

}
