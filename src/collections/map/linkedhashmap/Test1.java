package collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class Test1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Maths", 90);
		lhm.put("Physics", 80);
		lhm.put("Computers", 95);
		System.out.println("The LinkedHashMap size is : " + lhm.size());
		System.out.println("------------------------------------");
		System.out.println(lhm);
		System.out.println(lhm.get("Maths"));
		System.out.println(lhm.get("Physics"));
		System.out.println(lhm.get("Computers"));
		

	}

}
