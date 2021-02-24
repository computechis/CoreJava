package keywords.thiskeyword;

public class Student {
	/*
	 Using this keyword to refer current class instance variables
			or
	this keyword is useful to distinguish between global(instance variable) and local variables
	 */
	//instance variable
	int sNo;
	String sName;
	public void print(int sNo, String sName) {//local variables
		this.sNo=sNo;
		this.sName=sName;
		System.out.println("----------print()----------");
		System.out.println("Student Number : " + sNo);
		System.out.println("Student Name : " + sName);
		System.out.println("-----------------------------");
	}
	public void show() {
		System.out.println("----------show()----------");
		System.out.println("Student Number : " + sNo);
		System.out.println("Student Name : " + sName);
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.print(11, "Pavan");
		obj.show();

	}

}
