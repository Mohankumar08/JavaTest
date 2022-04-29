package base;

import java.util.Scanner;

public class StringTasks {
	public static boolean
    onlyDigits(String str, int n)
    {
  
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
  
            // Check if the sepecified
            // character is a digit then
            // return true,
            // else return false
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
  
	public static void main(String[] args) {
		
		//String str = "9876q376698";
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		if (s1.matches("[0-9]")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
