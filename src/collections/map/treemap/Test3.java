package collections.map.treemap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test3 {
	// (key,value) pair -> Entry
	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Maths", 90);
		tm.put("Physics", 80);
		tm.put("Computers", 95);
		System.out.println("The TreeMap size is : " + tm.size());
		System.out.println("------------------------------------");
		Set<Entry<String, Integer>>  entries = tm.entrySet();
		for (Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --->  " + val);
		}
		

	}

}
