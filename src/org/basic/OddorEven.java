package org.basic;

import java.util.Scanner;

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

	}
}

