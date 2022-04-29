package org.continent;

public class Arts extends Education{
	public void bsc() {
		System.out.println("bsc");
	}
	public void bEd() {
		System.out.println("bEd");
	}
	public void ba() {
		System.out.println("ba");
	}

	public void bBa() {
		System.out.println("bBa");
	}
	@Override
	public void ug(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: " + sum );
		super.ug(5, 5);
	}
	
	@Override
	public void pg(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum: " + sum );
		super.pg(2, 3, 5);
	}

	public static void main(String[] args) {
		Arts a = new Arts();
		a.ba();
		a.bBa();
		a.bsc();
		a.bEd();
		a.ug(10, 5);
		a.pg(5, 5, 6);
		
	}

}
