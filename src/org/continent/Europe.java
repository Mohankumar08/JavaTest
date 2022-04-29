package org.continent;

public class Europe extends America {
	
	//parent class
	public void spain() {
		System.out.println("Good in Football");
	}
	public void germany() {
		System.out.println("Good in car manufactoring");
	}
	
	public static void main(String[] args) {
		Europe e = new Europe();
		e.spain();
		e.germany();
		e.newyork();
		e.california();
	}
	/*public static void main(String[] args) {
		Europe e = new Europe();
		e.spain();
		e.germany();
		Asia a = new Asia();
		a.china();
		a.india();
		Africa af = new Africa();
		af.southAfrica();
	}*/
}
