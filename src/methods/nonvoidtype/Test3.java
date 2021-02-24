package methods.nonvoidtype;

public class Test3 {
	
	public int val(int a) {
		return a;
	}

	public static void main(String[] args) {
		Test3 obj = new Test3();
		System.out.println("The value is : " + obj.val(10));
		System.out.println("The value is : " + obj.val(20));
		System.out.println("The value is : " + obj.val(30));
		System.out.println("The value is : " + obj.val(40));
		System.out.println("The value is : " + obj.val(50));

	}

}
