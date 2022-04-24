# A1Firstclass

~~~
package a1basic;

public class A1Firstclass {
	// Video-1 - Intro
	// Video-2 - Java Installation
	// Video-3 - Eclipse Installation
	/*
	 * Class: All code written in classes only Code is encapsulated into classes
	 * FileName === ClassName
	 *
	 * what is public static void main All Execution of code should be placed in
	 * this block Java Control directly in this block only Responsible for execution
	 */

	// Video-4
	static int a = 4;
	int b = 5;

	public static void main(String[] args) {
		System.out.print("Hi");
		System.out.print("Hello World");
		// HiHello World

		System.out.println("Hi");
		System.out.println("Hello World");
		// Hi
		// Hello World

		// 'ln' stands for nextLine

		// for comment

		/*
		 * // multi line comment
		 */

		/*
		 * to print int value you need to store in some variable and use (objectName) in
		 * main method here Number 4 is assigning to a variable = - used for assigning
		 * value to the left side variable
		 */

		System.out.println(a);
		// 4

		// Video-5

		// if you store in some variable then no need to give "<variableName>" in syso
		// if we give variable in "" then java will take as string

		System.out.println("a");
		// a

		/*
		 * Methods: blocks in java class once write use multiple times public void
		 * getData() {} getData - Name of block of code or MethodName void/int/String -
		 * return type of method void - doesn't return anything public/private - Access
		 * Modifiers To Call/Execute this method - must be called from main method
		 */

		/*
		 * Why Methods? - to avoid same code multiple times or duplicates We can create
		 * one block and call whenEver required
		 */

		/*
		 * No methods are allowed inside main block inside class outside main method
		 */

		/*
		 * How do you get created method in Main method? create an object for the class
		 * where you're method is defined and use (objectName) in main method
		 */

		// Video-6
		// object: instance/reference of a class
		// we can call variable/methods inside class
		// new keyword use for - to allocate memory for that object for class
		// return type is class only

		A1Firstclass s = new A1Firstclass();
		// syntax of an object

		/*
		 * A1Firstclass - returnType - Always ClassName s - object reference
		 * variable/name new - used for memory allocation A1Firstclass() - Object of
		 * class - A1Firstclass();
		 */

		s.getData();
		// I am in method
		System.out.println(s.b);
		// 5
		// variable value

		// File - A2Secondclass
		// A2Secondclass - class object and calling setData Method
		A2Secondclass sc = new A2Secondclass();
		sc.setData();
		// I am in second class method
	}

	public void getData() {
		System.out.println("I am in method");
		// return 2; - int
		// return "hello"; - String
	}
}
~~~

--------------

# A2Secondclass

```
package a1basic;

//Video-6

public class A2Secondclass {

	public static void main(String[] args) {

	}

	public void setData() {
		System.out.println("I am in second class method");
	}
}
```

-------------

# A3Stringclasseemo

```
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
```
---------

# A4Reversedemo

```
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

		if (s.equals("rev")) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
```
