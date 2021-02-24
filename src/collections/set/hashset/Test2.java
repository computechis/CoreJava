package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println("The hash set size is : " + hs.size());
		System.out.println("---------------------");
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
