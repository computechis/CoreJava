package controlflowstatements.simpleif;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// Write a program to find the Big number among two numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Big number is : " + num1);
		}
		
		sc.close();

	}

}
