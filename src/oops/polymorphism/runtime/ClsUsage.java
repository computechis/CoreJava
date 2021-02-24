package oops.polymorphism.runtime;

public class ClsUsage {

	public static void main(String[] args) {
			Vehicle v = new Vehicle();
			v.start();
			//v.stop();
			Vehicle.stop();
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			MakeHonda hObj = new MakeHonda();
			hObj.start();
			//hObj.stop();
			MakeHonda.stop();
		}

}
