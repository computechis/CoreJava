package wrapperClasses;

public class Demo {

	public static void main(String[] args) {
		String  arr [] = {"10","20"};
		System.out.println("Before : " + (arr[0]+arr[1]));
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		System.out.println("After : " + (a + b));
		
		/*
		int num1 = 32790;
		Integer obj1 = new Integer(num1);
		System.out.println(obj1);
		String num2 = "44664";
		Integer obj2 = new Integer(num2);
		System.out.println(obj2);
		*/

	}
/*
 Integer obj2 = new Integer("abcd");
 java.lang.NumberFormatException: For input string: "abcd"
 	at wrapperClasses.Demo.main(Demo.java:10)
 */
}
