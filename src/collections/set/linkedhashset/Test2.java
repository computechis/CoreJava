package collections.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(40);
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		System.out.println("The linked hash set size is : " + lhs.size());
		System.out.println("---------------------");
		Iterator<Integer> iter = lhs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
