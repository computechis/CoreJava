package deriveddatatypes.singledimensionalarray;

public class Test4 {

	public static void main(String[] args) {
		/*
		 Syntax 3:
		 =========
		 datatype [] arrayName ={val1, val2,..,valn};
		 */
		String [] tools = {"Selenium", "QTP", "CodedUI", "RFT", "SilkTest", "JMeter", "LR","WebLoad", "RPT", "SilkPerformer"};
		System.out.println("The string array length is : " + tools.length);
		for(int i = 0; i < tools.length; i++)
		{
			System.out.println(tools[i]);
		}
		
	}

}
