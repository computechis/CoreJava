package operators;

public class TestUnary {

	public static void main(String[] args) {
		
		System.out.println("----------Increment operator '++'--------------");
		int a = 100;
		a++; // a = a + 1;
		System.out.println("The A  value is : " + a); //101
		System.out.println("----------Decrement operator '--'--------------");
		int b = 50;
		b--; // b = b - 1;
		System.out.println("The B  value is : " + b); //49
		System.out.println("----------not operator '!'---------------");
		boolean c = true;
		System.out.println(c);//true
		System.out.println(!c); //false
		
	}

}
