package controlflowstatements.switchcase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week day number : ");
		int weekDayNo=sc.nextInt();
		switch(weekDayNo) {
		case 1:
			System.out.println("Mon Day..");
			break;
		case 2:
			System.out.println("Tue Day..");
			break;
		case 3:
			System.out.println("Wed Day..");
			break;
		case 4:
			System.out.println("Thu Day..");
			break;
		case 5:
			System.out.println("Fri Day..");
			break;
		case 6:
			System.out.println("Sat Day..");
			break;
		case 7:
			System.out.println("Sun Day..");
			break;
		default:
			System.out.println("Invalid day entered that is : "+ weekDayNo);
			
		}
		sc.close();

	}

}
