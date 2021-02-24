package collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {
	// (key,value) pair -> Entry
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Maths", 90);
		lhm.put("Physics", 80);
		lhm.put("Computers", 95);
		System.out.println("The LinkedHashMap size is : " + lhm.size());
		System.out.println("------------------------------------");
		Set<Entry<String, Integer>>  entries = lhm.entrySet();
		for (Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --->  " + val);
		}
		

	}

}
