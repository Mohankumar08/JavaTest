package org.continent;

public class MethodOverLoad {
	//Method Overloading
	//Same Class, Method 
	//Different Argument
	
	//depends on data type
	private void employeeDetails(String empName) {
		System.out.println("Employee Name:" +empName);
	}
	
	private void employeeDetails(int empAge) {
		System.out.println("Employee Name:" +empAge);
	}
	
	private void employeeDetails(char empGender) {
		System.out.println("Employee Name:" +empGender);
	}
	
	private void employeeDetails(long empMobile) {
		System.out.println("Employee Name:" +empMobile);
	}

	public static void main(String[] args) {
		MethodOverLoad m = new MethodOverLoad();
		m.employeeDetails("Mohan");
		m.employeeDetails(29);
		m.employeeDetails('M');
		m.employeeDetails(9876671324l);
		
		m.employeeDetails("Kumar");
		m.employeeDetails(29);
		m.employeeDetails('M');
		m.employeeDetails(9876676324l);
	}
}
