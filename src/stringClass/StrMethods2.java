package stringClass;

public class StrMethods2 {

	public static void main(String[] args) {
		String s1 = "ComputechInfoSolutions";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.charAt(0));//C
		System.out.println(s1.charAt(9));//I
		System.out.println(s1.charAt(21));//s
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.substring(9));
		System.out.println(s1.substring(9, 13));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1);
		System.out.println(s1.replace('t', '2'));
		System.out.println(s1.replace("Info", "Hyd"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.lastIndexOf('y'));

	}

}
