package keywords.thiskeyword;

public class Student3 {
	
	int sNo;
	String sName;
	public void print(int stNo, String stName) {
		sNo=stNo;
		sName=stName;
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
		Student3 obj = new Student3();
		obj.print(11, "Pavan");
		obj.show();

	}

}
