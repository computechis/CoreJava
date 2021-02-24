package keywords.thiskeyword;

public class Employee {
	//using this() keyword to invoke the current class constructor
	// Default constructor
	public Employee() {
		System.out.println("--------Zero arg Constructor--------");
		System.out.println("Employee object is created..");
		System.out.println("----------------------------------------------");
	}
	//One arg constructor
	public Employee(int eNo) {
		this();
		System.out.println("--------One arg Constructor--------");
		System.out.println("Employee Number : " + eNo);
		System.out.println("----------------------------------------------");
	}
	//Two arg constructor
	public Employee(String eName, double eSalary) {
		this(66);
		System.out.println("--------Two arg Constructor--------");
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Salary : " + eSalary);
		System.out.println("----------------------------------------------");
		//this();//Error message as "Constructor call must be the first statement in a constructor"
	}
	public static void main(String[] args) {
		Employee e2 = new Employee("Shiny", 35000.50);
	}

}
