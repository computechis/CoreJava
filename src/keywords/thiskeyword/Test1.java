package keywords.thiskeyword;

public class Test1 {
	//instance varaibles
	int a = 11;
	int b = 22;
	//Using this keyword to invoke the current class method
	//instance method
	public void show() {
		System.out.println("--------------show()-----------");
		// local variable
		int b = 33;
		int c = 44;
		System.out.println("The instance variable value is : " + a);
		System.out.println("The instance variable value is : " + this.b);
		System.out.println("The local variable value is : " +b);
		System.out.println("The local variable value is : " +c);
		System.out.println("-------------------------");
		//msg();
		this.msg();
	}
	public void msg() {
		System.out.println("--------------msg()-----------");
		System.out.println("It is a message method..");
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
		
		obj.show();
		//obj.msg();

	}

}
