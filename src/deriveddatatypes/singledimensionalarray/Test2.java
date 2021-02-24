package deriveddatatypes.singledimensionalarray;

public class Test2 {

	public static void main(String[] args) {
		/*
		 Syntax 2:
		 ---------------------
		 datatype arrayName[] = new datatype[size];
		 */
		int arr [] = new int [5]; // define the array size
		System.out.println("The integer array length is : " + arr.length);
		
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		 arr[4]=50;
		 /*
		 To retrieve the value from an array:
		 ---------------------------------
		 System.out.println( arrayName[index]);
		 */
		
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
	}

}
