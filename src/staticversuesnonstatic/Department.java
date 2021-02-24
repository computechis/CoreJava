package staticversuesnonstatic;

public class Department {
	
	// instance variable or non static variable
	int dNo;
	public String dName;
	int noOfEmps;
	
	// static variable
	public static String cName;
	
	// instance methods or non static methods
	void addDept() {
		System.out.println("--------addDept--------");
		System.out.println("Department is added..");
	}
	public void changeDept() {
		System.out.println("--------changeDept--------");
		System.out.println("Department is changed..");
	}
	
	// static method
	public static void salary() {
		System.out.println("-------salary()-----------");
		System.out.println("Salary is credited to accounts..");
	}
	static void holiday() {
		System.out.println("-------holiday()-----------");
		System.out.println("National holiday granted...");
	}
	public static void main(String[] args) {
		System.out.println("^^^^^^^^^Static^^^^^^^^^");
		System.out.println("_________________________________");
		cName="Capgemeni";
		System.out.println("Company Name : " + cName);
		salary();
		holiday();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("^^^^^^^^^NonStatic^^^^^^^^^");
		System.out.println("_________________________________");
		Department d1 = new Department();
		d1.dNo=11;
		d1.dName="Sales";
		d1.noOfEmps=500;
		System.out.println("Department Number : " + d1.dNo);
		System.out.println("Department Name : " + d1.dName);
		System.out.println("Number of Emps in a Department: " + d1.noOfEmps);
		d1.addDept();
		d1.changeDept();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Department d2 = new Department();
		d2.dNo=12;
		d2.dName="IT";
		d2.noOfEmps=3000;
		System.out.println("Department Number : " + d2.dNo);
		System.out.println("Department Name : " + d2.dName);
		System.out.println("Number of Emps in a Department: " + d2.noOfEmps);
		d2.addDept();
		d2.changeDept();

	}
}
