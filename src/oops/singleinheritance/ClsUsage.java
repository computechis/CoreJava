package oops.singleinheritance;

public class ClsUsage {

	public static void main(String[] args) {
		ClsParent pObj = new ClsParent();
		System.out.println("The ClsParent class int variable value is : " + pObj.a);
//		System.out.println("The ClsChild class int variable value is : " + pObj.b); // Error
		pObj.m1();
//		pObj.m2(); // Error
		System.out.println("-------------------");
		ClsChild cObj = new ClsChild();
		System.out.println("The ClsParent class int variable value is : " + cObj.a);
		System.out.println("The ClsChild class int variable value is : " + cObj.b);
		cObj.m1();
		cObj.m2();
	

	}

}
