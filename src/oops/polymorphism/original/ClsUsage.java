package oops.polymorphism.original;

public class ClsUsage {

	public static void main(String[] args) {
		System.out.println("---------Animal Class---------");
		Animal a = new Animal();
		a.move();
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("---------Bird Class---------");
		Bird b = new Bird();
		b.move();
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("---------Fish Class---------");
		Fish f = new Fish();
		f.move();
		
	}

}
