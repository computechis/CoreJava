package oops.abstraction3;

public abstract class Vehicle1 {

	// Undefined method or Unimplemented methods
		public abstract void start();
		
		public abstract void stop();
		
		// defined methods or implemented methods 
		
		public void buildDate() {
			System.out.println("---------buildDate()------");
			System.out.println("It is defined or Implemented method..");
			System.out.println("Today...");
			System.out.println("-------------------------------");
		}
		public static void main(String[] args) {
			Vehicle2 obj = new Car();
			obj.start();
			obj.move();
			obj.stop();
			obj.buildDate();
		}
}
