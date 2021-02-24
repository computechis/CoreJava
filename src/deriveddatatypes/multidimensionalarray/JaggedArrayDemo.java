package deriveddatatypes.multidimensionalarray;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		/*
		 int [][] arr = new int[3][3];
		  or
		  int [][] arr = new int[3][];
			arr[0]=new int [3];
			arr[1]=new int [3];
			arr[2]=new int [3];

		 */
		int [][] arr = new int[3][];
		arr[0]=new int [3];
		arr[1]=new int [2];
		arr[2]=new int [4];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println(i+" array length : " +arr[i].length );
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
