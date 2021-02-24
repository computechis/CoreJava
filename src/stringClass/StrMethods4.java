package stringClass;

public class StrMethods4 {

	public static void main(String[] args) {
		
		String s1 ="Computech";
		String s2 ="Info";
		String s3 ="Solutions";
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2.concat(s3)));
		String str ="  Hyderabad  ";
		System.out.println(str);
		System.out.println(s1.concat(str).concat(s3));
		System.out.println(str.trim());
		System.out.println(s1.concat(str.trim()).concat(s3));

	}

}
