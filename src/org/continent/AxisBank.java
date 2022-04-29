package org.continent;

public interface AxisBank   {
	
	default void savings() {
		this.deposit();
		System.out.println("Savingsis 10%");
	}
	default void deposit() {
		System.out.println("Deposit is 12%");
	}
	
	//public abstract void deposit();
	
/*	@Override
	public void savings() {
	System.out.println("Savings rate: 12 %");	
	}
	@Override
	public void fixed() {
	System.out.println("Fixed Rate: 11%");	
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.fixed();
		a.savings();
		a.deposit();
	}
*/
}
