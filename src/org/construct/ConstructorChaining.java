package org.construct;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(13);
		System.out.println("Default Constructor");
	}
	public ConstructorChaining(int id) {
		this(12,"Kumar");
		System.out.println("Id: " +id);
	}
	
	public ConstructorChaining(int id, String name) {
		System.out.println("Id: " + id + "\t Name: " +name);
	}
	
}
