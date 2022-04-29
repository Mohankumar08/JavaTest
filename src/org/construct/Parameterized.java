package org.construct;

public class Parameterized {
	int id;
	String name;
	
	public Parameterized(int id, String name) {
		this.id=id;
		this.name = name;
	}
	public static void main(String[] args) {
		// This would invoke the parameterized constructor.
		Parameterized p = new Parameterized(12	,"Mohan");
		System.out.println("Id: " + p.id +"\nName: " + p.name);
	}

}
