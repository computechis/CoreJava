package collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println("The TreeSet size is : " + ts.size());
		System.out.println("---------------------");
		Iterator<Integer> iter = ts.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
