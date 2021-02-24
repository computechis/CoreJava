package stringClass;

public class StrMethods6 {

	public static void main(String[] args) {
		String s1 = "This is a test";
		//String s2 = "This", "is","an","test";
		System.out.println("The given string length is :" +s1.length());
		String [] strArr = s1.split(" ");
		System.out.println("The string array length is : "+ strArr.length);
		System.out.println("-------------------------");
		for(String strVal : strArr)
		{
			System.out.println(strVal);
		}

	}

}
