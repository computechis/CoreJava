package oops.polymorphism.runtime;

public class MakeHonda extends Vehicle{

	public void start() {
		System.out.println("--------start()--------");
		System.out.println("It is a MakeHonda's class method..");
		System.out.println("Self start to the bike..");
		System.out.println("--------------------------");
	}
	
	public static void stop() {
		System.out.println("--------stop()--------");
		System.out.println("It is a MakeHonda's user defined method..");
		System.out.println("Stop the honda vehicle..");
		System.out.println("-------------------------");
	}


}
