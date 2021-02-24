package controlflowstatements.ifelse;

public class Test1 {

	public static void main(String[] args) {
		// Write a program to find the Big number among two numbers
		int a = 10, b = 10;
		
		if(a > b)
		{
			System.out.println("Inside the if block");
			System.out.println("Big Number : " + a);
		}
		else
		{
			System.out.println("Inside the else block");
			System.out.println("Big Number : " + b);
		}
		

	}

}
