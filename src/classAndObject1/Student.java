package classAndObject1;

public class Student {
	// Variables
		public int sNo;
		public String sName;
	// methods
		public void print() {
			System.out.println("--------print()----------");
			System.out.println("Printing the student details");
		}
	public static void main(String[] args) {
		/*
		 Object construction statement:
		 ClassName referenceVaraiable/objectName = new ClassName();
		 */
		Student s1 = new Student();
		/*
		 To access the variables and assign the values:
		 -----------------------------------------------
		 referenceVaraiable.variableName=value;
		 */
		s1.sNo=101;
		s1.sName="Pavan";
		System.out.println("Student Number : "+ s1.sNo);
		System.out.println("Student Name : " + s1.sName);
		/*
		 To invoke the methods or To access the methods:
		 ------------------------------------------------
		 referenceVaraiable.methodName();
		 */
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
