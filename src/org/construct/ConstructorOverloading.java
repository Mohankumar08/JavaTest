package org.construct;

public class ConstructorOverloading {

	 public ConstructorOverloading(int id) {
		 System.out.println("Id is: " + id);
	 }
	 public ConstructorOverloading(int id, String name) {
		 System.out.println("Id is: " + id);
		 System.out.println("Name is: " + name);
	 }
	 public ConstructorOverloading() {
		 System.out.println("Default constructor");
	 }
	 public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(12);
		ConstructorOverloading co1 = new ConstructorOverloading(13,"Mohan");
		ConstructorOverloading c02 = new ConstructorOverloading();
		
	}

}
