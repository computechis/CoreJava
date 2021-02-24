package collections.list.arraylist;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		//collections can't store primitive values
//		ArrayList<int> al = new ArrayList<int>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("The array list size is : " + al.size());
		//System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));

	}

}
