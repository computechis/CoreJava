package methods.constructors;

public class Vehicle3 {
	// Two arg constructor
	public Vehicle3(int speed, String color) {
		System.out.println("--------Two arg constructor--------------");
		System.out.println("Vehicle Speed : " + speed);
		System.out.println("Vehicle Color : " + color);
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		Vehicle3 obj1 = new Vehicle3(100, "Red");
		Vehicle3 obj2 = new Vehicle3(100, "White");
		Vehicle3 obj3 = new Vehicle3(125, "Red");
		Vehicle3 obj4 = new Vehicle3(150, "Yellow");

	}

}
