package oops.interface4;

public class Car implements Vehicle1, Vehicle2 {

	@Override
	public void move() {
		System.out.println("Car is moving..");
	}

	@Override
	public void start() {
		System.out.println("Car started..");

	}

	@Override
	public void stop() {
		System.out.println("Car stopped..");
	}

}
