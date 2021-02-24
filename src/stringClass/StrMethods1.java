package stringClass;

public class StrMethods1 {

	public static void main(String[] args) {
		
		String s1 = "ComputechInfoSolutions";
		String s2 = "Computech Info Solutions";
		System.out.println("The s1 string length is : " + s1.length());
		System.out.println("The s2 string length is : " + s2.length());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.startsWith("c")); //false
		System.out.println(s1.startsWith("C")); //true
		System.out.println(s1.startsWith("Com")); //true
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.endsWith("z")); //false
		System.out.println(s1.endsWith("s")); //true
		System.out.println(s1.endsWith("ions")); //true
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.contains("info")); //false
		System.out.println(s1.contains("Info")); //True
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}

}
