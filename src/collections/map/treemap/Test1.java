package collections.map.treemap;

import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Maths", 90);
		tm.put("Physics", 80);
		tm.put("Computers", 95);
		System.out.println("The TreeMap size is : " + tm.size());
		System.out.println("------------------------------------");
		System.out.println(tm);
		System.out.println(tm.get("Maths"));
		System.out.println(tm.get("Physics"));
		System.out.println(tm.get("Computers"));
		

	}

}
