package deriveddatatypes.singledimensionalarray;

public class Test1 {

	public static void main(String[] args) {
		/*
		 Syntax 1:
		 ---------------------
		 datatype arrayName[];
		 arrayName = new datatype[size];
		 */
		int arr []; // int [] arr; // Array declaration
		arr = new int [5]; // define the array size
		System.out.println("The integer array length is : " + arr.length);
		/*
		 To assign the value to an array:
		 ---------------------------------
		 arrayName[index] = value;
		 */
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		 arr[4]=50;
		 arr[5]=60;// Error
		 /*
		 To retrieve the value from an array:
		 ---------------------------------
		 System.out.println( arrayName[index]);
		 */
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 System.out.println(arr[4]);
		 
	}
/*
 arr = new int [-5];
 Exception in thread "main" java.lang.NegativeArraySizeException
 */
/*
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
 	at deriveddatatypes.singledimensionalarray.Test1.main(Test1.java:25)
 */
}
