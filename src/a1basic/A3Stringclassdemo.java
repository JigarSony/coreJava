package a1basic;

//Video-7
public class A3Stringclassdemo {

	public static void main(String[] args) {
		// String : it is one of prebuilt class in java

		/*
		 * two ways to define string 1. String literal 2. by creating object of string
		 */

		String a = "Hello"; // String literal
		String b = "Hello";

		String ab = new String("Hello"); // with string class
		String abc = new String("Hello");

		/*
		 * In literal- Internally string will create object in back end String a = new
		 * String("Hello"); So why we're creating with object
		 * 
		 * for that if String a = "Hello";
		 * 
		 * String object a and hello to it When it come to String b = "Hello"; before
		 * creating an object for Hello first it goes in String pool whether is there
		 * any Hello string already define
		 * 
		 * If available it simply refer "Hello" to the b object reference name Java will
		 * not create other object
		 * 
		 * with string object it'll create by forcing to create new object for String
		 * abc = new String("Hello");
		 */

		// Video-8

		// String Methods - Manipulate string
		// https://www.w3schools.com/java/java_ref_string.asp
		// In String index start from 0
		System.out.println(a.charAt(2));
		// l
		System.out.println(a.indexOf("e"));
		// 1
		// if no matching characters it gives -1

		String d = "javatraining";
		System.out.println(d.substring(3, 6));
		// atr

		System.out.println(d.substring(3));
		// atraining

		System.out.println(d.indexOf("e"));
		// -1 if nothing here it'll be giving -1

		System.out.println(d.concat("Good Teaches"));
		// javatrainingGood Teaches

		System.out.println(d.length());
		// 12

		String e = " javatraining";
		System.out.println(e.trim());
		// javatraining

		System.out.println(e.toUpperCase());
		// JAVATRAINING

		System.out.println(e.toLowerCase());
		// javatraining

		String f = "javatraining";

		String[] arr = f.split("t");
		// t is delimeter heres
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		// java
		// raining

		System.out.println(f.replace("t", "s"));
		// javasraining

		/*
		 * String Methods - Please go thro all these methods and update here f.charAt(0)
		 * f.chars() 
		 * f.codePointAt(0)
		 * f.codePointBefore(0)
		 * f.codePoints()
		 * f.compareTo(e)
		 * f.compareToIgnoreCase(Methods) 
		 * f.concat(Methods)
		 * f.contains(Methods)
		 * f.contentEquals(Methods)
		 * f.describeConstable()
		 * f.endsWith(f)
		 * f.equals(e)
		 * f.equalsIgnoreCase(e) 
		 * f.formatted(args)
		 * f.getBytes() 
		 * f.getBytes(0, 0, null,0);
		 * f.getClass() 
		 * f.hashCode()
		 * f.indent(0) 
		 * f.indexOf(0) f.indexOf(0, 0)
		 * f.intern() 
		 * f.isBlank()
		 * f.isEmpty() 
		 * f.lastIndexOf(0)
		 * f.lastIndexOf(f)
		 * f.length() 
		 * f.lines() 
		 * f.matches(e) 
		 * f.notify(); 
		 * f.notifyAll();
		 * f.offsetByCodePoints(0, 0) 
		 * f.regionMatches(0, e, 0, 0)
		 * f.repeat(0)
		 * f.replace(0, 0)
		 * f.replaceFirst(e, e)
		 * f.resolveConstantDesc(null)
		 * f.split(e)
		 * f.startsWith(f)
		 * f.strip()
		 * f.stripIndent()
		 * f.stripLeading()
		 * f.stripTrailing()
		 * f.subSequence(0, 0)
		 * f.substring(0)
		 * f.toCharArray()
		 * f.toLowerCase()
		 * f.toString()
		 * f.toUpperCase()
		 * f.transform(null)
		 * f.translateEscapes() 
		 * f.trim()
		 * f.wait();
		 * f.CASE_INSENSITIVE_ORDER 
		 * f.copyValueOf(null, 0, 0)
		 * f.format(null,
		 * f, args)
		 * f.join(e, arr)
		 * f.valueOf(0)
		 */
	}
}