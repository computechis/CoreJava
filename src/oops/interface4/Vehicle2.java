package oops.interface4;

public interface Vehicle2 extends Vehicle1{
	// Constructor // Error message as "Interfaces cannot have constructors "
	/*public Vehicle2() {
		
	}*/
	// public static final variables
	public static final int COURSE_DURATION=60;
	public final static String COURSE_LOCATION="HYDERABAD";
	
	// public abstract mehtods
	public abstract void move();
	
	public static void print() {
		System.out.println("===========print()==========");
		System.out.println("It is a static defined method / static implemented method ");
	}
}
