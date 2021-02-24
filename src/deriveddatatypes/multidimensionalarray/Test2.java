package deriveddatatypes.multidimensionalarray;

public class Test2 {

	public static void main(String[] args) {
		
		int [][] arr;
		arr = new int[3][2];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
		System.out.println("Total rows : " + arr.length);
		
		System.out.println("Total cols : " + arr[0].length);
		
		for(int rowNo=0; rowNo < arr.length; rowNo++)
		{
			for(int colNo=0; colNo < arr[rowNo].length; colNo++)
			{
				System.out.print(arr[rowNo][colNo]+ " ");
			}
			System.out.println();
		}
		
	}

}
