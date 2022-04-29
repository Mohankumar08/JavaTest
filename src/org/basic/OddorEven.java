package org.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int n = sc.nextInt();
		int count = 1;
		for (int i = 1; i <= n; i++) {
			count = count * i;
		}
		System.out.println("Factorial of given no is: " + count);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String a = "java";
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String original = sc.nextLine();
		Pattern pattern = Pattern.compile("\\s");
		String[] temp = pattern.split(original);
	     
		String reverse = "";
		
		int length = original.length();
		 for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1)
	                reverse = temp[i] + reverse;
	            else
	                reverse = " " + temp[i] + reverse;
	        }
	  
		System.out.println(reverse);
	
}
}

