package stringClass;

public class StrMethods3 {

	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "SELENIUM";
		String s3 = "selenium";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //true
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.compareTo(s2)); // +ve
		System.out.println(s1.compareTo(s3)); // 0
		System.out.println(s2.compareTo(s1));// -ve
		System.out.println(s1.compareToIgnoreCase(s2)); // 0
		System.out.println(s1.compareToIgnoreCase(s3)); // 0
		System.out.println(s2.compareToIgnoreCase(s1));// 0

	}

}
