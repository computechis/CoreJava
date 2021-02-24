package keywords.superkeyword;
//super can be used to refer immediate parent class instance variable.
class Vehicle{
	int speed=100;
	String color ="Black";
}
class Honda extends Vehicle{
	
	int speed = 125;
	String color = "Yellow";
	public void show() {
		System.out.println("Vehicle speed : " + super.speed);
		System.out.println("Vehicle color : " + super.color);
		System.out.println("Honda speed : " + this.speed);
		System.out.println("Honda color : " + this.color);
//		System.out.println("Honda speed : " + speed);
//		System.out.println("Honda color : " + color);
	}
	
}
public class ClsUsage {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.show();

	}

}
