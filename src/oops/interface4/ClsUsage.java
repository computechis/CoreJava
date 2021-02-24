package oops.interface4;

public class ClsUsage {

	public static void main(String[] args) {
//		Vehicle2 ob = new Vehicle2();
		System.out.println("-----------public static final Variables-----------");
		System.out.println("Student Name is : " + Vehicle1.ST_NAME);
		System.out.println("Course Name is : " + Vehicle1.COURSE_NAME);
		
		System.out.println("Course Duration is : " + Vehicle2.COURSE_DURATION);
		System.out.println("Course Location is : " + Vehicle2.COURSE_LOCATION);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("-----------public static methods-----------");
		Vehicle1.show();
		Vehicle2.print();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/*
		 To create an instance or To create an Object
		 ---------------------------------------------
		 InterfaceName refVar = new ClassName();
		 */
		// Ploymorphic statement
		System.out.println("-----------public abstract methods-----------");
//		Vehicle2 obj = new Bike();
//		Vehicle2 obj;
//		obj = new Car();
//		obj.start();
//		obj.move();
//		obj.stop();
//		System.out.println("^^^^^^^^^^^^^");
//		obj = new Bike();
//		Vehicle2 obj = new Train(); //Error
		Vehicle2 obj = new Bike();
		obj.start();
		obj.move();
		obj.stop();
		//obj = new Train(); //Error

	}

}
