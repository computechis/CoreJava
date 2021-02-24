package stringClass;

public class Demo2 {

	public static void main(String[] args) {
		
		int a = 10, b=20;
		String s1 ="Automation";
		String s2 ="Testing";
		System.out.println(a+b);   //30
		System.out.println(s1+s2); //AutomationTesting
		System.out.println(a+b+s1+s2);//30AutomationTesting
		System.out.println(s1+s2+a+b);//AutomationTesting1020
		System.out.println(s1+s2+(a+b));//AutomationTesting30
	}

}
