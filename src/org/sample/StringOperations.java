package org.sample;

public class StringOperations {
	
	//String Length
	public static int getStringLength(String str)
    {
        return str.length();
    }
	
	//To find Particular character - charAT
	public static char getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
	
	//To find String is Empty or not
	public static boolean getEmpty(String str)
	{
		return str.isEmpty();
	}
	
	//To get Index value
	public static int getIndex(String str, String str1)
	{
		return str.indexOf(str1);
	}
	
	//To get Last Index value
	public static int getLastIndex(String str, String str1)
	{
		return str.lastIndexOf(str1);
	}
	
	//To convert String into UpperCase
	public static String getUpperCase(String str)
    {
        return str.toUpperCase();
    }
	
	//To convert String into LowerCase
	public static String getLowerCase(String str)
	{
	     return str.toLowerCase();
	}
	
	//To starts with a particular character
	public static boolean getStartWith(String str, String str1) {
		return str.startsWith(str1);
	}
	
	//To ends with a particular character
	public static boolean getEndsWith(String str, String str1) {
		return str.endsWith(str1);
	}
	//To check particular character is present or not
	public static boolean getContains(String str, String str1)
	{
		return str.contains(str1);
	}
	
	//To replace particular character
	public static String getReplace(String str, String str1, String str2)
	{
		return str.replace(str1, str2);
	}
	
	//To replace particular word
	public static String getReplaceAll(String str, String str1, String str2)
	{
		return str.replaceAll(str1, str2);
	}
	
	//Remove unwanted spaces
	public static String getTrim(String str)
	{
		return str.trim();
	}
	
	//To get a particular value
	public static String getSubString(String str, int index)
	{
		return str.substring(index);
	}
	
	//To get a particular value
		public static String getSubString1(String str, int index, int index1)
		{
			return str.substring(index,index1);
		}
		
		//To split the given String
		public static String[] getSplit(String str, String regex)
		{
			return str.split(regex);
		}
		
		//To compare two string is equal or not
		public static boolean getEqual(String str, String str1) {
			return str.equals(str1);
		}
		
		//To compare two string is equal or not
		public static boolean getEqualIngnore(String str, String str1) {
			return str.equalsIgnoreCase(str1);
		}
		
		//To join Two Strings
		public static String getConcat(String str, String str2)
		{
			return str.concat(str2);
		}

	public static void main(String[] args) {
		
	/*	String s = "GreensTechnology";
		String s1 = "SeleniumAutomationtool";
		String s2 = "velmurugan";
		String s3 = "j a v a p r o g r a m";
		String s4 = "9095484678";
		*/
		
		String s = "GreensTechnology";
		String s1 = "   Selenium Automation tool     ";
		
		int length = getStringLength(s);
		System.out.println("String Length is " + length);
		
		char charFromString = getCharFromString(s, 5);
		System.out.println(charFromString);
		
		int length1 = getStringLength(s1);
		System.out.println("String Length is " + length1);
		
		
		boolean empty = getEmpty(s);
		System.out.println(empty);
		
		int in = getIndex(s, "h");
		System.out.println("The index value is " + in );
		
		int last = getLastIndex(s, "o");
		System.out.println("Last Index " + last);
		
		int last1 = getLastIndex(s, "z");
		System.out.println("Last Index " + last1);

		String up = getUpperCase(s);
		System.out.println(up);
		
		String lo = getLowerCase(s);
		System.out.println(lo);
		
		Boolean start = getStartWith(s, "q");
		System.out.println(start);
		
		Boolean end = getEndsWith(s, "y");
		System.out.println(end);
		
		Boolean con = getContains(s, "e");
		System.out.println(con);
		
		String rep = getReplace(s, "s", "5");
		System.out.println(rep);
		
		String repAll = getReplaceAll(s1, "tool", "framework");
		System.out.println(repAll);
		
		String trim = getTrim(s1);
		System.out.println(trim);
		
		String subString = getSubString(s1, 15);
		System.out.println(subString);
		
		String subString1 = getSubString1(s1, 0, 9);
		System.out.println(subString1);
		
		String[] split = getSplit(s, "");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2 = "hai";
		String s3 = "HAI";
		boolean equal = getEqual(s2, s3);
		System.out.println(equal);
		
		boolean equalIngnore = getEqualIngnore(s2, s3);
		System.out.println(equalIngnore);
		
		String concat = getConcat(s2, s3);
		System.out.println(concat);
		
		// Get the String
        String str = "GeeksForGeeks";
  
        // Get the index
        int index = 5;
  
        // Get the specific character
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);		
	}

}
