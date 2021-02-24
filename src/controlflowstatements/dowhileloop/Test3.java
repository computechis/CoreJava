package controlflowstatements.dowhileloop;

public class Test3 {

	public static void main(String[] args) {
		// Write a program to print the even numbers from 10 to 1 that means 10,8,6,4,2
		int i = 10;
		do {
			System.out.println(i);//10, 8, 6, 4, 2
			i = i - 2;
		} while (i >= 1);

	}

}
