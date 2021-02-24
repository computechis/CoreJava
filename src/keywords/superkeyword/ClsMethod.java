package keywords.superkeyword;
class ClsParent{
	public void display() {
		System.out.println("---------display()-----------");
		System.out.println("It is a ClsParent class Method");
		System.out.println("-----------------------------");
	}
}
class ClsChild extends ClsParent{
	public void display() {
		System.out.println("---------display()-----------");
		System.out.println("It is a ClsChild class display() Method");
		System.out.println("-----------------------------");
	}
	public void show() {
		System.out.println("---------show()-----------");
		System.out.println("It is a ClsChild class show() Method");
		System.out.println("-----------------------------");
		this.display();
		super.display();
	}
}
public class ClsMethod {
	
	public static void main(String[] args) {
		ClsChild obj = new ClsChild();
	
		obj.show();
	}

}
