package controlflowstatements.foreachloop;

public class Test3 {

	public static void main(String[] args) {
		/*
		 Syntax 3:
		 =========
		 datatype [] arrayName ={val1, val2,..,valn};
		 */
		String [] tools = {"Selenium", "QTP", "CodedUI", "RFT", "SilkTest", "JMeter", "LR","WebLoad", "RPT", "SilkPerformer"};
		System.out.println("The string array length is : " + tools.length);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		for(String toolName : tools) {
			System.out.println(toolName);
		}
		
	}

}
