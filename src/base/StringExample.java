package base;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome to Java and Selenium Class               ";
		System.out.println(s);
		//Welcome to Java and Selenium Class               
		
		int s1 = s.length();
		System.out.println(s1);
		//49
		
		char charAt = s.charAt(6);
		System.out.println(charAt);
		//e
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		//false
		
		int indexOf = s.indexOf("W");
		System.out.println(indexOf);
		//0
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		//31
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		//WELCOME TO JAVA AND SELENIUM CLASS
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		//welcome to java and selenium class
		
		boolean startsWith = s.startsWith("H");
		System.out.println(startsWith);
		//false
		
		boolean endsWith = s.endsWith("s");
		System.out.println(endsWith);
		//false
		
		boolean endsWith1 = s.endsWith("Class");
		System.out.println(endsWith1);
		//false
		
		boolean contains = s.contains("e");
		System.out.println(contains);
		//true
		
		String replace = s.replace("s", "5");
		System.out.println(replace);
		//Welcome to Java and Selenium Cla55
		
		String replaceAll = s.replaceAll("Java", "Python");
		System.out.println(replaceAll);
		//Welcome to Python and Selenium Class
		
		String trim = s.trim();
		System.out.println(trim);
		//Welcome to Java and Selenium Class
		
		String substring = s.substring(8);
		System.out.println(substring);
		//to Java and Selenium Class
		
		String substring2 = s.substring(0, 7);
		System.out.println(substring2);
		//Welcome
		
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		/*Welcome 
		  to
		  Java
		  and
		  Selenium
		  Class 
		 */
		 
		String s2 = "Hai";
		String[] split1 = s2.split("");
		for (String string : split1) {
			System.out.println(string);
		}
		/*H
		  a
		  i */
		
		String st = "Welcome to TestNG";
		System.out.println(st);
		//Welcome to TestNG
		
		boolean equals = s.equals(st);
		System.out.println(equals);
		//false
		
		boolean equalsIgnoreCase = st.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
		//false
		
		String st1 = "hi ";
		System.out.println(st1);
		//hi
		
		String concat = st1.concat(st);
		System.out.println(concat);
		//hi Welcome to TestNG
		
		String st2 = "hi";
		boolean equals2 = st1.equals(st2);
		System.out.println(equals2);
		//false
		
		String st3 = "HI";
		boolean equalsIgnoreCase2 = st2.equalsIgnoreCase(st3);
		System.out.println(equalsIgnoreCase2);
		//true
		
	}

}
