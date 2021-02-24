package keywords.finalKeyword;
// If you make any method as final, you cannot override it.
class Vehicle{
	public final void start() {
		System.out.println("-----start()-----------");
		System.out.println("Kick to start the bike..");
		System.out.println("------------------------");
	}
}
class Honda extends Vehicle{
	//Error message as Cannot override the final method from Vehicle
	/*public void start() {
		System.out.println("-----start()-----------");
		System.out.println("Self start to the bike..");
		System.out.println("------------------------");
	}*/
}
public class ClsMethod {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.start();

	}

}
