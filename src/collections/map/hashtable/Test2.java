package collections.map.hashtable;

import java.util.Hashtable;

public class Test2 {

	public static void main(String[] args) {
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("Course1", "Selenium");
		ht1.put("Course2", "RestAssured");
		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht2.put("Location1", "India");
		ht2.put("Location2", "USA");
		Hashtable<String, Hashtable<String, String>> ht = new Hashtable<String, Hashtable<String, String>>();
		ht.put("Institute", ht1);
		ht.put("Country", ht2);
		System.out.println("The hashtable size is : " + ht.size());
		System.out.println(ht.get("Institute").get("Course1"));
		System.out.println(ht.get("Country").get("Location1"));
		System.out.println("------------------------------");
		System.out.println(ht.get("Institute").get("Course2"));
		System.out.println(ht.get("Country").get("Location2"));
		}

}
