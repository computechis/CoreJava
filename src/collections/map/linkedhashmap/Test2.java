package collections.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Maths", 90);
		lhm.put("Physics", 80);
		lhm.put("Computers", 95);
		System.out.println("The LinkedHashMap size is : " + lhm.size());
		System.out.println("------------------------------------");
		Set<String> keys=lhm.keySet();
		for(String keyName : keys)
		{
			System.out.println(keyName);
		}
		System.out.println("----------");
		Collection<Integer> values = lhm.values();
		for(Integer val : values)
		{
			System.out.println(val);
		}
	}

}
