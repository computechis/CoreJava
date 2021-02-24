package collections.list.linkedlist;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("The LinkedList size is : " + ll.size());
		//System.out.println(al);
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));

	}

}
