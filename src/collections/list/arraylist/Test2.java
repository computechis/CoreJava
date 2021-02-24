package collections.list.arraylist;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("The array list size is : " + al.size()); //3
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("------------------------------");
		al.add(40);
		System.out.println("The array list size is : " + al.size());//4
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Integer ele : al)
		{
			System.out.println(ele);
		}
		System.out.println("------------------------------");
		al.add(0, 90);
		System.out.println("The array list size is : " + al.size());//4
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Integer ele : al)
		{
			System.out.println(ele);
		}
	}

}
