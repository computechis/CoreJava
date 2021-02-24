package oops.abstraction3;

public class ClsUsage {

	public static void main(String[] args) {
		
		/*
		 To create an object or Object construction statement:
		 AbstractClass refVar = new Class(); // Polymorphic Statement
		 */
//		Vehicle2 obj = new Bike();
		Vehicle2 obj = new Car();
//		Vehicle2 obj = new Auto(); // Error
		obj.start();
		obj.move();
		obj.stop();
		obj.buildDate();

	}

}
