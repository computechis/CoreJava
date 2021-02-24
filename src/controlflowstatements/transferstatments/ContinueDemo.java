package controlflowstatements.transferstatments;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
			if(i == 5) {
				continue;
			}
			System.out.println(i); 
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		int num = 1;
		while( num <= 10)
		{
			if(num == 5) //num=5
			{
				num++; //num=6
				continue;
			}
			System.out.println(num); //1, 2, 3, 4, 6, 7, 8, 9, 10
			num++;
		}
	}

}
