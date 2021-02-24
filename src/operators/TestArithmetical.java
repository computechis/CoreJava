package operators;

public class TestArithmetical {

	public static void main(String[] args) {
		int num1 = 6, num2 = 3, result;
		System.out.println("----------Addition operator '+'--------------");
		result = num1 + num2;
		System.out.println("Addition of two integers is : " + result); //9
		System.out.println("----------Subtraction operator '-'--------------");
		result = num1 - num2;
		System.out.println("Subtraction of two integers is : " + result);//3
		System.out.println("----------Multiplication operator '*'--------------");
		result = num1 * num2;
		System.out.println("Multiplication of two integers is : " + result);//18
		System.out.println("----------Division operator '/'--------------");
		result = num1 / num2;
		System.out.println("Division of two integers is : " + result);//2
		System.out.println("----------Modulus operator '%'--------------");
		result = num1 % num2;
		System.out.println("Modulus of two integers is : " + result);//0

	}

}
