package keywords.finalKeyword;
/*If you make any variable as final, you cannot change the value of 
 final variable(It will be constant). 
 */
public class ClsVaraible {

	public static void main(String[] args) {
		
		int a = 10, b = 20, result;
	
		result = a + b;
		System.out.println("The result is : " + result); //30
		a =50;
		result = a + b;
		System.out.println("The result is : " + result); //70
		b = 75;
		result = a + b;
		System.out.println("The result is : " + result); //125
		System.out.println("--------------------------");
		int x = 100, sum;
		final int Y = 200;
		sum = x + Y;
		System.out.println("The sum is : " + sum); //300
		x = 500;
		sum = x + Y;
		System.out.println("The sum is : " + sum);//700
		//y = 1000; // Error
		sum = x + Y;
		System.out.println("The sum is : " + sum);
		

	}

}
