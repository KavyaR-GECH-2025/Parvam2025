package arrayStringInJava.strings;

public class StringInJava {

	public static void main(String[] args) {
		/*
		 * Strings: it is a group of characters
		 * ex: table
		 * need to enclose within "".
		 * 
		 * how to declare the string :
		 *      1. using string literals
		 *      String var_name = "string_name";
		 *      
		 *      1. using new keyboard
		 *      String var_name = new String("string_name");
		 * 
		 */
		
		String str1 = "String1";
		String str2 = new String("String1");
		String str3 = "String1";
		String str4 = new String("String1");
//		System.out.println(str1);
//		System.out.println(str2);
		System.out.println(str1.equals(str2));  // checks for values
		System.out.println(str1==str2);  // check for reference/address
		System.out.println(str1==str3); 
		System.out.println(str1.equals(str3));
		System.out.println(str2==str3);
		System.out.println(str2==str4);
		System.out.println(str2.equals(str4));
		
		// we cannot change the value of string but we can re-assign the value for string
		String str5 = new String("String5");
		str5 = str5.concat(" Hello");
		System.out.println(str5);
		

	}

}
