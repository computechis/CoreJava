package collections.list.arraylist;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Red");
		al1.add("Blue");
		al1.add("Green");
		System.out.println("The first arraylist size is : " + al1.size());
		System.out.println("---------------------------------");
		for (String color : al1) {
			System.out.println(color);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("White");
		al2.add("Black");
		al2.add("Pink");
		System.out.println("The second arraylist size is : " + al2.size());
		System.out.println("---------------------------------");
		al1.addAll(al2);
		System.out.println("The first arraylist size is : " + al1.size());
		System.out.println("---------------------------------");
		for (String color : al1) {
			System.out.println(color);
		}
		
		/*al1.addAll(1, al2);
		System.out.println("The first arraylist size is : " + al1.size());
		System.out.println("---------------------------------");
		for (String color : al1) {
			System.out.println(color);
		}*/
		}

}
