package org.construct;

public class NonParameter {
int id;
String name;
public NonParameter() {
	System.out.println("Non parameterized constructor");
}
public static void main(String[] args) {
	NonParameter n = new NonParameter();
	// Default constructor provides the default
    // values to the object like 0, null
	System.out.println(n.id);
    System.out.println(n.name);
    
}
}
