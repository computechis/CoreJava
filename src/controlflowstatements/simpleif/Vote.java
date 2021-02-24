package controlflowstatements.simpleif;

public class Vote {

	public static void main(String[] args) {
		// Write a program to find the person is eligible to vote or not?
		System.out.println("Begining..");
		int age;
		age = 18;
		
		if(age >= 18)
		{
			System.out.println("Eligible to vote ..");
			System.out.println("The person age is : " + age);
		}
		System.out.println("Ending");
	}

}
