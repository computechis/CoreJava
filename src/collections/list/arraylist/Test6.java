package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		System.out.println("The array list is Empty status : " + al.isEmpty()); //true
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The array list is Empty status : " + al.isEmpty()); //false
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The array list size is : " + al.size());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (Integer val : al) {
			System.out.println(val);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		al.remove(2);
		System.out.println("The array list size is : " + al.size());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (Integer val : al) {
			System.out.println(val);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		al.clear();
		System.out.println("The array list size is : " + al.size());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (Integer val : al) {
			System.out.println(val);
		}
	}

}
