package org.basic;
import java.util.regex.Pattern;
import java.util.Scanner;

public class BasicJavaPrograms {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
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
