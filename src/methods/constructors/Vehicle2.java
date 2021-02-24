package methods.constructors;

public class Vehicle2 {
	// One arg constructor
	public Vehicle2(int speed) {
		System.out.println("--------one arg constructor--------------");
		System.out.println("Vehicle speed : " + speed);
		System.out.println("-----------------------------------------");
	}
	public static void main(String[] args) {
		//ClassName refVar = new ClassName();
		Vehicle2 obj1 = new Vehicle2(100);
//		Vehicle2 obj2 = new Vehicle2(125);
//		Vehicle2 obj3 = new Vehicle2(150);
	}

}
