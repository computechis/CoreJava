package deriveddatatypes.singledimensionalarray;

public class Test5 {

	public static void main(String[] args) {
		Object arr [] = new Object [5]; 
		System.out.println("The integer array length is : " + arr.length);
		 arr[0]=10;
		 arr[1]=20.5;
		 arr[2]=false;
		 arr[3]="vasu";
		 arr[4]='d';
		
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
	}
}
