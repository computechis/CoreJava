package controlflowstatements.dowhileloop;

public class Test2 {

	public static void main(String[] args) {
		// Write a program to print the numbers from 10 to 1
		
		int num = 10;
		do
		{
			System.out.println(num);//10, 9, 8,..., 2, 1
			num--; // num = num - 1;
		}while(num >= 1);

	}

}
