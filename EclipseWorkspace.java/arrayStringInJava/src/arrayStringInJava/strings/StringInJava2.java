package arrayStringInJava.strings;

public class StringInJava2 {

	public static void main(String[] args) {
		/*
		 * String methods:
		 *    1. equals
		 *    2. ==
		 *    3. comapreTo
		 *    4. concat
		 *    5. touppercase
		 *    6. tolowercase
		 *    7. trim
		 *    8. startswith
		 *    9. endswith
		 *    10. strip
		 *    11. equalsignorecase
		 *    12. isBlank()
		 */
		
		String str1 = new String("Hello World");
		String str2 = new String("hello world");
		String str3 = new String("      Kavya           R");
		
		//equals
		System.out.println("equals: "+str1.equals(str2));
		
		//equalsignorecase
		System.out.println("equalsIgnorecase: "+str1.equalsIgnoreCase(str2));
		
		// ==
		System.out.println("==: "+str1==str2);
		
		//concat
		System.out.println("concat: "+str1.concat(" ").concat(str2));
		
		//touppercase
		System.out.println("toUpperCase: "+str1.toUpperCase());
		
		//tolowercase
		System.out.println("toLowerCase: "+str1.toLowerCase());
		
		//trim
		System.out.println("Trim: "+str3.trim());
		
		//startswith
		System.out.println("startsWith: "+str1.startsWith(str1));
		
		//endswith
		System.out.println("endsWith: "+str1.endsWith(str2));
		
		//strip
		System.out.println("Strip: "+str3.strip());
		
		//isBlank
		System.out.println("isBlank: "+str1.isBlank());
		
		//comapreTo
		System.out.println("compareTo: "+str1.compareTo(str2));

	}

}
