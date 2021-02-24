package collections.map.treemap;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Maths", 90);
		tm.put("Physics", 80);
		tm.put("Computers", 95);
		System.out.println("The TreeMap size is : " + tm.size());
		System.out.println("------------------------------------");
		Set<String> keys=tm.keySet();
		for(String keyName : keys)
		{
			System.out.println(keyName);
		}
		System.out.println("----------");
		Collection<Integer> values = tm.values();
		for(Integer val : values)
		{
			System.out.println(val);
		}
	}

}
