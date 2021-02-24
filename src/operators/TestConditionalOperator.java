package operators;

public class TestConditionalOperator {

	public static void main(String[] args) {
		//Condtional Operator or Ternary Operator -> ? : 
		// Syntax : (condition) ? exp1 : exp2
		int x = 100, y = 250;
		int max = (x >y )? x : y; 
		System.out.println("Max number is : " + max);
		// Difference
		System.out.println( (x > y)  ? x-y : y-x);
		//System.out.println(10<3 ?(10>5 ? "Hai":"hello"):"bye");

	}

}
