package stringClass;

public class StrMethods5 {

	public static void main(String[] args) {
		
		String str="";
		System.out.println(str.isEmpty());//true
		str = "Testing";
		System.out.println("The given string is : " + str);
		System.out.println("The string length is : " + str.length());
		System.out.println(str.isEmpty()); //false
		System.out.println("~~~~~~~~~~~~~~~~");
		char [] arr = str.toCharArray();
		System.out.println("The character array length : " + arr.length);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		for(char val : arr)
		{
			System.out.println(val);
		}


	}

}
