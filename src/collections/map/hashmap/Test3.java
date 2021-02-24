package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {
	// (key,value) pair -> Entry
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Maths", 90);
		hm.put("Physics", 80);
		hm.put("Computers", 95);
		System.out.println("The hash map size is : " + hm.size());
		System.out.println("------------------------------------");
		Set<Entry<String, Integer>>  entries = hm.entrySet();
		for (Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --->  " + val);
		}
		

	}

}
