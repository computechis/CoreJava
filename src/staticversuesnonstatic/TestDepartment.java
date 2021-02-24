package staticversuesnonstatic;

public class TestDepartment {

	public static void main(String[] args) {
		System.out.println("^^^^^^^^^Static^^^^^^^^^");
		System.out.println("_________________________________");
		Department.cName="Capgemeni";
		System.out.println("Company Name : " + Department.cName);
		Department.salary();
		Department.holiday();
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
