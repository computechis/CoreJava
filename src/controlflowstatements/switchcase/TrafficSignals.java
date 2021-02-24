package controlflowstatements.switchcase;

import java.util.Scanner;

public class TrafficSignals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic signal color : ");
		String color = sc.next();
		color = color.toLowerCase();//pink
		switch (color) {
		case "red":
			System.out.println("Stop..");
			System.out.println("Traffic signal Color is : " + color);
			break;
		case "green":
			System.out.println("Go..");
			System.out.println("Traffic signal Color is : " + color);
			break;
		case "yellow":
		    System.out.println("Ready to Go / Ready to Stop..");
		    System.out.println("Traffic signal Color is : " + color);
			break;
		default:
			System.out.println("You enterred the wrong input that is : " + color);
		}
		//System.out.println("Enterred color is : " + color);
		sc.close();

	}

}
