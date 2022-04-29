package org.continent;

public class Asia extends America{
	//Grand Parent Class
	public void china() {
		System.out.println("Largest Population");
	}
	public void india() {
		System.out.println("Second Largest Population");
	}
	
	public static void main(String[] args) {
		Asia a = new Asia();
		a.china();
		a.india();
		a.california();
		a.newyork();
	}
}
