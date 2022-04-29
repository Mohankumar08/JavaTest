package org.continent;

public class CityBank implements AxisBank {
	
	@Override
	public void savings() {
	System.out.println("Citybank 9%");
	AxisBank.super.savings();
	}
	
	public static void main(String[] args) {
		CityBank c = new CityBank();
		c.savings();
	}
	/*
	public void saving() {
		System.out.println("Savings rate: 12 %");	
		}
	public void deposit() {
		System.out.println("Deposit Amount: 1000 ");
	}
	public void fixed() {
		System.out.println("Fixed Rate: 11%");	
		}

	public static void main(String[] args) {
		CityBank c =new CityBank();
		c.saving();
		c.fixed();
		c.deposit();
	}
	public abstract void savings();
	public abstract void fixed();
	public void deposit() {
		System.out.println("Deposit Amount: 1000 ");
	}
*/
	
	
}
