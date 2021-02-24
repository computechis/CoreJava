package methods.nonvoidtype;

public class Test1 {
	
	int x = 20;
	public int first() {
		int a = 10;
		return a;
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
		System.out.println("The x value is : " + obj.x);
		System.out.println(obj.first());
		int num = obj.first();
		System.out.println("The value is : " + num);
		
	}

}
