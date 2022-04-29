package org.continent;

public class MethodOverRide1 extends MethodOverRide {

	@Override
	public void taxLimit(String name) {
		System.out.println("Name is: " + name);
		super.taxLimit("Mohan");
	}
	
	public static void main(String[] args) {
		MethodOverRide1 mo = new MethodOverRide1();
		mo.taxLimit("Kumar");
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	@Override
	public void deposit(int rate) {
		System.out.println("Deposit Amount is: " + rate);
		super.deposit(13);
	}
	private void fixed() {
		System.out.println("Fixed rate: 12%");
	}
	private void saving() {
		System.out.println("Saving Amount: 1000");
	}
	
	public static void main(String[] args) {
		MethodOverRide1 m1 = new MethodOverRide1();
		m1.saving();
		m1.fixed();
		m1.deposit(15);
	}
	//saving(),fixed(),deposit()
	
	 @Override
	public void taxLimit(String name) {
		System.out.println("Name" + name);
		super.taxLimit("Mohaan");
	}
	
	public static void main(String[] args) {
		MethodOverRide1 m1 = new MethodOverRide1();
		m1.taxLimit("kumar");
	} 
}
*/