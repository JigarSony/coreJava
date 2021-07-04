package a1basic;

public class A3Stringclasseemo {

	public static void main(String[] args) {		
		//String : it is on of prebuilt class in java
		
		/*
		 * two ways to define string
		 * 1. String literal
		 * 2. by creating object of string
		 */
		
		String a = "Hello"; //String literal
		String b = "Hello";
		
		String ab = new String("Hello"); //with string class
		String abc = new String("Hello");
		
		/*
		 * By internally for literal string will create object in backend
		 * So why we're creating with object
		 * 
		 * for that if 
		 * String a = "Hello";
		 * 
		 * String object a and hello to it
		 * When it come to String b = "Hello"; before creating an object for Hello first it goes 
		 * in String pool whether is there any hello string already define
		 * 
		 * If available 
		 * it simply refer to b object ref name
		 * Java will no create other object 
		 * 
		 * with string object it'll create by forcing to create new object for
		 * String abc = new String("Hello");
		 */
		
		//String Methods
		//index start from 0
		System.out.println(a.charAt(2));
		//l
		System.out.println(a.indexOf("e"));
		//1
		
		String d = "javatraining";
		System.out.println(d.substring(3, 6));
		//atr
		System.out.println(d.substring(3));
		//atraining
		System.out.println(d.indexOf("e"));
		//-1 if nothing here it'll be giving -1
		
		System.out.println(d.concat("Good Teaches"));
		//javatrainingGood Teaches
		
		System.out.println(d.length());
		//12
		
		String e = " javatraining";
		System.out.println(e.trim());
		//javatraining
		System.out.println(e.toUpperCase());
		// JAVATRAINING
		System.out.println(e.toLowerCase());
		// javatraining
		
		String f = "javatraining";
		
		String [] arr = f.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//java
		//raining
		
		System.out.println(f.replace("t", "s"));
		//javasraining
	}
}