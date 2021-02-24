package controlflowstatements.forloop;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Printing the numbers from  10 to 100 for every 10th number ");
		System.out.println("-----------------------------------");
		for(int num = 10; num <= 100; num = num + 10)
		{
			System.out.println(num);//10, 20, 30, 40,...,90, 100
		}

	}

}
