package controlflowstatements.ifelseif;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		System.out.println("------------Begining------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student total marks : ");
		int total = sc.nextInt();
		if (total >= 800) {
			System.out.println("Grade A");
			System.out.println("Total marks : " + total);
		} else if (total < 800 && total >= 700) {
			System.out.println("Grade B");
			System.out.println("Total marks : " + total);
		} else if (total < 700 && total >= 600) {
			System.out.println("Grade C");
			System.out.println("Total marks : " + total);
		} else if (total < 600) {
			System.out.println("Grade D");
			System.out.println("Total marks : " + total);
		}
		System.out.println("------------Endining------------");
		sc.close();
	}
}
