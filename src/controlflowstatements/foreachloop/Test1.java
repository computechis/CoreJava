package controlflowstatements.foreachloop;

public class Test1 {

	public static void main(String[] args) {
		
		int arr [] = new int [5]; // define the array size
		System.out.println("The integer array length is : " + arr.length);
		
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		 arr[4]=50;
		
		/*
		 For each loop or enhanced for loop: 
		 ------------------------------------
		 Syntax :
		 -------
		 for(datatype variableName : ArrayName/CollectionName)
		 {
		 	System.out.println(variableName);
		 }
		 */
		 for(int val : arr )
		 {
			 System.out.println(val);
		 }
		
	}

}
