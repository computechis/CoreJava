package methods.constructors;

public class Vehicle {
	int speed=100;
	String color ="Red";
	public Vehicle() {
		System.out.println("-------------default constructor-------------");
		System.out.println("Vehicle object is created..");
		System.out.println("-----------------------------------------------");
		System.out.println("Vehicle speed : " + speed);
		System.out.println("Vehicle color : " + color);
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {
		Vehicle obj = new Vehicle(); 
	}

}
