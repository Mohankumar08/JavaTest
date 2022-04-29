package org.continent;

public class MethodOverLoad1 {
	
	private void tc1(String name, int age) {
		System.out.println("Name: " + name + "\n" + "Age:" + age);
	}
	
	private void tc1(String name, int age, String comName, int id) {
		System.out.println("Name: " + name + "\n" + "Age:" + age + "\n" + "Company: " + comName + "\n" + "Id: " + id);
	}
	
	public static void main(String[] args) {
		MethodOverLoad1 m1 = new MethodOverLoad1();
		m1.tc1("Mohan", 29);
		m1.tc1("kumar", 24, "Greens", 10);
	}
	/*private int tc01(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	private int tc01(int a, int b,int c) {
		int sum = a + b + c;
		return sum;
	}

		public static void main(String[] args) {
			MethodOverLoad1 me = new MethodOverLoad1();
			int tc = me.tc01(10, 5);
			System.out.println("Sum: "+ tc);
			
			int tc1 = me.tc01(10, 5, 15);
			System.out.println("Sum: " + tc1);
		}*/
}
