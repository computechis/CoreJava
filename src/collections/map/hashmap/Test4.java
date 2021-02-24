package collections.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
			List<String> ap = new ArrayList<String>();
			ap.add("Vijayawada");
			ap.add("Vizag");
			List<String> ts = new ArrayList<String>();
			ts.add("Hyderabad");
			ts.add("Secunderabad");
			List<String> tn = new ArrayList<String>();
			ts.add("Chennai");
			ts.add("Selam");
		hm.put("Andhra", ap);
		hm.put("Telangana", ts);
		hm.put("TamilNadu", tn);
		System.out.println("The hashmap size is : " + hm.size());
		System.out.println("-----------------------");
		Set<Entry<String, List<String>>> entries = hm.entrySet();
		for (Entry<String, List<String>> entry : entries) {
			String key= entry.getKey();
			System.out.println("Key is : " + key);
			System.out.println("~~~~~~~~~~~");
			List<String> values = entry.getValue();
			for(String val : values)
			{
				System.out.println(val);
			}
			System.out.println("-----------------");
		}
	}

}
