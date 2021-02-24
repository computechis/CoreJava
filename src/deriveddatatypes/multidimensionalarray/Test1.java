package deriveddatatypes.multidimensionalarray;

public class Test1 {

	public static void main(String[] args) {
		/*
		 Syntax 1:
		 ---------------------
		 datatype arrayName[][];
		 arrayName = new datatype[rows][cols];
		 */
		// 2 D Array : Array of arrays
		int [][] arr;
		arr = new int[3][2];
		/*
		 To assign the value to an array:
		 ---------------------------------
		 arrayName[rowNo][colNo] = value;
		 */
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		/*
		 To find the total rows in an array :
		 System.out.println("Total rows : " + arrayName.length );
		 */
		System.out.println("Total rows : " + arr.length);
		/*
		 To find the total cols in an array :
		 System.out.println("Total cols : " + arrayName[rowNo].length );
		 */
		System.out.println("Total cols : " + arr[0].length);
		/*
		 To fetch the value from an array:
		 ---------------------------------
		 System.out.println( arrayName[rowNo][colNo]);
		 */
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
	}

}
