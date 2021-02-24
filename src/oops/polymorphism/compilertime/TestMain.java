package oops.polymorphism.compilertime;

public class TestMain {

	public static void main(String[] args) {
		DemoMain.main(10);
		DemoMain.main(new String[]{"Shiny", "Vijay", "Pavan"});
		DemoMain.main(20, 200);
		DemoMain.main("Good Morning");
		DemoMain.main("ManualTesting", "Java");
//		DemoMain.main(new int[] {10,20,30,40,50});
		int [] iarr = {10,20,30,40,50};
		DemoMain.main(iarr);
	}

}
