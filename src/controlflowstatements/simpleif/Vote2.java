package controlflowstatements.simpleif;

import java.util.Scanner;

public class Vote2 {

	public static void main(String[] args) {
		/*
		 Object Creation Statment:
		 -------------------------
		 ClassName referenceVariable = new ClassName();
		 */
		// Write a program to find the person is eligible to vote or not?
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter person age : ");
		int age =sc.nextInt();
		if(age >= 18) { 
			System.out.println("Eligible to vote ..");
			System.out.println("The person age is : " + age);
		}
		
		sc.close();
	}

}
