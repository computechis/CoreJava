package controlflowstatements.foreachloop;

public class Test2 {

	public static void main(String[] args) {
		
		char [] alphabets = new char [6];
		alphabets[0]='A';
		alphabets[1]='B';
		alphabets[2]='C';
		alphabets[3]='D';
		alphabets[4]='E';
		alphabets[5]='F';
		System.out.println("The character array length is : " + alphabets.length);
		System.out.println("-------------------------------------");
		for(char val : alphabets)
		{
			System.out.println(val);
		}
		
	}

}
