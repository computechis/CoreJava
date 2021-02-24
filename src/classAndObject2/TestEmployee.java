package classAndObject2;

import classAndObject1.Student;;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eNo=55;
		e1.eName="Vijay";
		e1.eGrade='A';
		e1.eSal=30000.5;
		e1.display();
		e1.holiday();
		System.out.println("####################");
		Employee e2 = new Employee();
		e2.eNo=66;
		e2.eName="Shiny";
		e2.eGrade='B';
		e2.eSal=45000;
		e2.display();
		e2.holiday();
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Student s1 = new Student();
		s1.sNo=101;
		s1.sName="Pavan";
		System.out.println("Student Number : "+ s1.sNo);
		System.out.println("Student Name : " + s1.sName);
		s1.print();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		Student s2 = new Student();
		s2.sNo=102;
		s2.sName="Shiny";
		System.out.println("Student Number : "+ s2.sNo);
		System.out.println("Student Name : " + s2.sName);
		s2.print();
	}

}
