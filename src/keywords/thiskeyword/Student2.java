package keywords.thiskeyword;

public class Student2 {
	
	int sNo;
	String sName;
	public void print(int sNo, String sName) {
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
		Student2 obj = new Student2();
		obj.print(11, "Pavan");
		obj.show();

	}

}
