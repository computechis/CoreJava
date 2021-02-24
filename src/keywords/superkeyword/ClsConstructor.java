package keywords.superkeyword;
//super() can be used to invoke immediate parent class constructor.
// super() can be used to access the zero parameterized constructor of parent class
//super(...) can be used to access the parameterized constructor of parent class
class Department {
	public Department() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a Department's class default constructor..");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public Department(int dNo) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("It is a Department's class one arg constructor..");
		System.out.println("Department Number : " + dNo);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}

class Employee extends Department {
	public Employee() {
		super(10);
		System.out.println("-------------Default Constructor-------------");
		System.out.println("It is a Employee's class default constructor..");
		System.out.println("---------------------------------------------");
	}
	public Employee(int eNo) {
		System.out.println("-------------One arg Constructor-------------");
		System.out.println("It is a Employee's class one arg constructor..");
		System.out.println("---------------------------------------------");
	}
	public Employee(String eName, double eSalary) {
		System.out.println("-------------Two arg Constructor-------------");
		System.out.println("It is a Employee's class two arg constructor..");
		System.out.println("---------------------------------------------");
	}
}

public class ClsConstructor {

	public static void main(String[] args) {
		Employee e1 = new Employee();
//		Employee e2 = new Employee(66);
//		Employee e3 = new Employee("Vijay", 50000);



	}

}
