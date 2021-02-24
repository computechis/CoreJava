package collections.iterator;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("The hash set size is : " + hs.size());
		System.out.println("-------------------------");
		Iterator<Integer> iter = hs.iterator();
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		

	}

}
