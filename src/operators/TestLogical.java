package operators;

public class TestLogical {

	public static void main(String[] args) {
		
		System.out.println("-------And Operator '&&' ----------");
		//Result Criteria for And Operator (&&)
		boolean a = true, b = true;
		System.out.println(a && b); //true
		System.out.println(a && (!b)); //false
		System.out.println((!a) && b); //false
		System.out.println((!a) && (!b)); //false
		System.out.println("-------OR Operator '||' ----------");
		//Result Criteria for OR Operator (||)
		System.out.println(a || b); //true
		System.out.println(a || (!b)); //true
		System.out.println((!a) || b); //true
		System.out.println((!a) || (!b)); //false
		System.out.println("-------Not Operator '!' ----------");
		//Result Criteria for Not Operator (!)
		System.out.println(!(a && b)); //false
		System.out.println(!(a && (!b))); //true
		System.out.println(!((!a) && b)); //true
		System.out.println(!((!a) && (!b))); //true
	}

}
