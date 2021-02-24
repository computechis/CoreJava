package oops.polymorphism.compilertime;

public class Employee {
	
	// Default constructor
	public Employee() {
		System.out.println("--------Zero arg Constructor--------");
		System.out.println("Employee object is created..");
		System.out.println("----------------------------------------------");
	}
	
	public Employee(int eNo) {
		System.out.println("--------One arg Constructor--------");
		System.out.println("Employee Number : " + eNo);
		System.out.println("----------------------------------------------");
	}
	public Employee(String eDes) {
		System.out.println("--------One arg Constructor--------");
		System.out.println("Employee Designation : " + eDes);
		System.out.println("----------------------------------------------");
	}
	public Employee(String eName, double eSalary) {
		System.out.println("--------Two arg Constructor--------");
		System.out.println("Employee Name : " + eName);
		System.out.println("Employee Salary : " + eSalary);
		System.out.println("----------------------------------------------");
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(); 
		Employee e2 = new Employee(11);
		Employee e3 = new Employee("TE");
		Employee e4 = new Employee("Shiny", 35000.50);
	}

}
