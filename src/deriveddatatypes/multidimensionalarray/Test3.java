package deriveddatatypes.multidimensionalarray;

public class Test3 {

	public static void main(String[] args) {
		/*
		 Syntax 2:
		 ---------------------
		 datatype arrayName[][] = new datatype[rows][cols];
		 */
//		char carr[] [] = new char [2][3];
		char [][] carr = new char [2][3];
		carr [0][0] = 'A';
		carr [0][1] = 'B';
		carr [0][2] = 'C';
		carr [1][0] = 'D';
		carr [1][1] = 'E';
		carr [1][2] = 'F';
		System.out.println("Total rows : " + carr.length);
		System.out.println("Total cols : " + carr[0].length);
		
		for(int rowNo = 0; rowNo < carr.length; rowNo++)
		{
			for(int colNo=0; colNo < carr[rowNo].length; colNo++)
			{
				System.out.print(carr[rowNo][colNo]+"   ");
			}
			System.out.println();
		}

	}

}
