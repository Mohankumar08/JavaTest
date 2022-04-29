package org.continent;

public class MethodOverLoad2 {
	private void tc1(String name, int age, char gender, long mob) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Mobile: " + mob);
	}
	
	private void tc1(int age, long mob, char gender, String name) {
		System.out.println("Age: " + age);
		System.out.println("Mobile: " + mob);
		System.out.println("Gender: " + gender);
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		MethodOverLoad2 m2 = new MethodOverLoad2();
		m2.tc1("Mohan", 29, 'M', 9677503833l);
		m2.tc1(22, 9159060833l, 'M', "Kumar");
		
	}
}
