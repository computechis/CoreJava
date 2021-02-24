package oops.abstraction2;

public abstract class Vehicle {
	
	// Undefined method or Unimplemented methods
	public abstract void start();
	
	public abstract  void stop();
	
	// defined methods or implemented methods 
	
	public void buildDate() {
		System.out.println("---------buildDate()------");
		System.out.println("It is defined or Implemented method..");
		System.out.println("Today...");
		System.out.println("-------------------------------");
	}

}
