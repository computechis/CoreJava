package collections.map.hashtable;

import java.util.Hashtable;

public class Test1 {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Maths", 95);
		ht.put("Physics", 75);
		ht.put("Computers", 90);
		System.out.println("The hashtable size is : " + ht.size());
		System.out.println("-----------------------------------");
		System.out.println(ht.get("Maths"));
		System.out.println(ht.get("Physics"));
		System.out.println(ht.get("Computers"));

	}

}
