package deriveddatatypes.multidimensionalarray;

public class Test4 {

	public static void main(String[] args) {
		/*
		 datatype [][] arrayName ={
		 							{val1, val2,..,valn}
		 							{val1, val2,..,valn}
		 							...........
		 							};
		 */
		String [][] tools = {	
								{"Selenium", "JMeter"},	
								{"UFT     ", "LR"},
								{"SilkTest", "SilkPerformer"},
								{"RFT     ", "RPT"}
							};
		System.out.println("Total rows : " + tools.length);
		System.out.println("Total cols : " + tools[0].length);
		
		for(int i = 0; i < tools.length; i++)
		{
			for(int j = 0; j < tools[i].length; j++)
			{
				System.out.print(tools[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
