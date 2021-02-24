package accessModifiers1;

public class ClsTwo {

	public static void main(String[] args) {
		ClsOne obj = new ClsOne();
		System.out.println("The 'public' access specifier of A value is : " + obj.a);
//		System.out.println("The 'private' access specifier of B value is : " + obj.b);//Error
		System.out.println("The 'protected' access specifier of C value is : " + obj.c);
		System.out.println("The 'default' access specifier of D value is : " + obj.d);
		
		obj.m1();
//		obj.m2();
		obj.m3();
		obj.m4();

	}

}
