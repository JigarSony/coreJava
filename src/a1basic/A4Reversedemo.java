package a1basic;

public class A4Reversedemo {
//Video-10
	public static void main(String[] args) {
		// Reverse a string
		// String is palindrome or not - madam - reverse madam

		String s = "madam";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.print(s.charAt(i));
			rev = rev + s.charAt(i);
			// System.out.println(rev);
		}
		
		/*
		 * rev=""
		 * rev=""+'m'
		 * rev="m"+'a'...+'d'...+'a'...'m'
		 */

		System.out.println(rev);
		//madam

		if (s.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		//Palindrome
	}
}