package controlflowstatements.nestedforloop;

public class MathsTables {

	public static void main(String[] args) {
		
		System.out.println("Printing maths tables from 1 to 10");
		System.out.println("----------------------------------");
		
		for(int table = 1; table <= 10; table++)
		{
			System.out.println("Maths table " + table + " is printing");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for(int i = 1; i <= 10; i++)
			{
				
				System.out.println(table + " * " + i + " = " + (table*i));
				
			}
			
			System.out.println("...........................");
			
		}

	}

}
