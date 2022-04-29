package base;

public class BaseClass {
	public BaseClass(String name) {
		this("Kumar",22);
		System.out.println("Name:" +name);
	}
	public BaseClass(String name, int id) {
		System.out.println("Name:" +name);
		System.out.println("Id:" +id);
	}
	public BaseClass() {
		this("Mohan");
		System.out.println("Default Constructor");
	}

}
