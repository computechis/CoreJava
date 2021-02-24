package oops.abstraction2;

public class ClsUsage {

	public static void main(String[] args) {
		//Vehicle obj = new Vehicle(); // Error message as "Cannot instantiate the type Vehicle"
		Bike b = new Bike();
		b.start();
		b.stop();
		System.out.println("------------------");
		Car c = new Car();
		c.start();
		c.stop();

	}

}
