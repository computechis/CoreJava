package oops.interface3;
//By using Interface, you can achieve multiple inheritances in java.
public class Bike implements Vehicle1, Vehicle2{

	@Override
	public void move() {
		System.out.println("Bike is moving..");
	}

	@Override
	public void start() {
		System.out.println("Bike started..");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped..");
	}

}
