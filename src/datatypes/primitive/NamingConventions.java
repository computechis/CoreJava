package datatypes.primitive;

public class NamingConventions {

	public static void main(String[] args) {
		
		// Variable name should stars with alphabet or dollar($) sign or underscore(_) sign
		/*int abc; // Valid
		int _xyz; // Valid
		int $mno; // Valid
		int 9ab; // Invalid
		int @qwe; // Invalid*/
		// Variable name should not contain special characters except dollar($) sign and underscore(_) sign
		/*int a_bdc; // valid
		int a$xy; // valid
		int a#er; // Invalid
		int txt box; //Invalid
		int a4c; //valid*/
		// Variable name should not be a keyword or reserved word
		/*int class; // Invalid
		int package; //Invalid
		int for; //Invalid
		int if; //Invalid
		int while; //Invalid*/
		// Variable names should not be duplicate (are unique)
		/*int a = 10;
		double a; // Invalid, here variable 'a' is duplicate variable*/
		// Variable names are case sensitive
		/*int a;
		A = 100; // Invalid, Here variable 'A' is case sensitive
		a = 100; // Valid*/
	}

}
