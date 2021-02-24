package oops.encapsulation;

public class ClsEncpasulation {

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println("Employee designation : " + obj.des);
		//System.out.println("Employee Salary : " + obj.salary);
		System.out.println("Employee Salary is : " + obj.getSalary("Manager"));
		System.out.println("-------------Hike--------------");
		obj.setSalary("25000","Admin");
		System.out.println("Employee Salary is : " + obj.getSalary("Manager"));
		

	}

}
