package controlflowstatements.whileloop;

public class OddNumber2 {

	public static void main(String[] args) {
		// Write a program to print the odd numbers from 1 to 10 i.e, 1, 3, 5, 7, 9
		int num = 1;
		while (num <= 10) {

			System.out.println(num); //1, 3, 5, 7, 9

			num = num + 2;
		}

	}

}
