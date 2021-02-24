package methods.voidtype;

public class Test6 {
	
	public void val(int a) {
		
		System.out.println("The integer value is : " + a);
	}
	public static void main(String[] args) {
		Test6 obj = new Test6();
		obj.val(10);
		obj.val(20);
		obj.val(30);
		obj.val(100);
		obj.val(66);
	}

}
