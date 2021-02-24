package controlflowstatements.transferstatments;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			if(i == 5) {
				break;
			}
			System.out.println(i); //1, 2, 3, 4
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		int num = 10;
		while(num >= 1)
		{
			System.out.println(num);
			num--; // num = num - 1;
			if(num == 5) {
				break;
			}
		}
		
	}

}
