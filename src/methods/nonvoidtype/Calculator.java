package methods.nonvoidtype;

import java.util.Scanner;

public class Calculator {
	public int add(int a, int b, int c) {
		int result;
		result = a + b + c;
		return result;
	}
	public double sub(double a, double b) {
		double result = a - b;
		return result;
	}
	public boolean isEven(int num) {
		if(num % 2 == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	/*
	 2 factorial : 2 * 1 = 2
	 3 factorial : 3 * 2 * 1 = 6
	 4 factorial : 4 * 3 * 2 * 1 = 24
	 5 factorial : 5 * 4 * 3 * 2 * 1 = 120 
	 */
	public long factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public String concatination(String a, String b) {
		String str = a + b;
		return str;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum=cal.add(10,20,30);
		System.out.println("The addition of three integers is : " + sum);
		/*int num=100, sub;
		sub = num - sum;
		System.out.println("Subtraction is : " + sub);*/
		System.out.println("The subtraction of two doubles is : " + cal.sub(23.5, 12.1));
		System.out.println("The even number status : " + cal.isEven(13));//false
		System.out.println("The even number status : " + cal.isEven(130));//true
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial ");
		int val = sc.nextInt();
		System.out.println("The factorial of a "+ val + " is : " + cal.factorial(val));
		sc.close();
		System.out.println("The concatination of two strings is : " + cal.concatination("Manual", "Testing"));
	}

}
