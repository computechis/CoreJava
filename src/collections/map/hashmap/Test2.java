package collections.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 95);
		System.out.println("The hash map size is : " + hm.size());
		System.out.println("------------------------------------");
		Set<String> keys=hm.keySet();
		for(String keyName : keys)
		{
			System.out.println(keyName);
		}
		System.out.println("----------");
		Collection<Integer> values = hm.values();
		for(Integer val : values)
		{
			System.out.println(val);
		}
	}

}
