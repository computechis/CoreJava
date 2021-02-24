package controlflowstatements.whileloop;

public class OddNumber {

	public static void main(String[] args) {
		// Write a program to print the odd numbers from 1 to 10 i.e, 1, 3, 5, 7, 9
		int odd = 1;
		while (odd <= 10) 
		{
			
			if (odd % 2 != 0) 
			{
				System.out.println(odd);
			}
			
			odd++; // odd = odd + 1;
		}

	}

}
