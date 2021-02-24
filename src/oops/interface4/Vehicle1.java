package oops.interface4;

public interface Vehicle1 {
	// public static final variables
	public static final String ST_NAME="Pavan";
	String COURSE_NAME="SELENIUM";
	
	// public abstract mehtods
	void start();
	public void stop();
	public static void show() {
		System.out.println("===========show()==========");
		System.out.println("It is a static defined method / static implemented method ");
	}
	public static void main(String[] args) {
		System.out.println("-----------public static final Variables-----------");
		System.out.println("Student Name is : " + Vehicle1.ST_NAME);
		System.out.println("Course Name is : " + Vehicle1.COURSE_NAME);
		
		System.out.println("Course Duration is : " + Vehicle2.COURSE_DURATION);
		System.out.println("Course Location is : " + Vehicle2.COURSE_LOCATION);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Vehicle2 obj = new Bike();
		obj.start();
		obj.move();
		obj.stop();
	}
}
