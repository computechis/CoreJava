package classAndObject2;

public class Employee {
	
	// Variables
		int eNo;
		double eSal;
		char eGrade;
		String eName;
	// Methods
		public void display() {
			System.out.println("---------display()-----------");
			System.out.println("Displaying the Employee details..");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Employee Number : " + eNo);
			System.out.println("Employee Salary : " + eSal);
			System.out.println("Employee Grade : " + eGrade);
			System.out.println("Employee Name : " + eName);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
		void holiday() {
			System.out.println("---------holiday()-----------");
			System.out.println("National holiday granted..");
			System.out.println("------------------------------");
		}

}
