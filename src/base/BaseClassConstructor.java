package base;

public class BaseClassConstructor {
/*	public BaseClassConstructor(String name) {
		System.out.println("Name:" + name);
	}
	public BaseClassConstructor(String name, int id) {
		super();
			}
	
	public BaseClassConstructor() {
super();
	}
	
	public static void main(String[] args) {
		BaseClassConstructor b = new BaseClassConstructor();
	}
*/
	public  static int a; 
private void local() {
int a=10;
}	
public static void main(String[] args) {
	BaseClassConstructor b = new BaseClassConstructor();
	System.out.println("Before: " +b.a);
	b.local();
	System.out.println("After: " +b.a);
	
	BaseClassConstructor b1 = new BaseClassConstructor();
	System.out.println("Before: " +b1.a);
	b1.local();
	System.out.println("After: " +b1.a);
}
}
