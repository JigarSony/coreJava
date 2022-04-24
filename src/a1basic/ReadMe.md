# A1Firstclass


~~~
package a1basic;

public class A1Firstclass {
  
/**
* Class: All code written in classes only Code is encapsulated into classes
* FileName === ClassName
*
* what is public static void main All Execution of code should be placed in
* this block Java Control directly in this block only Responsible for execution]
*/

// V-4

static int  _a_ = 4;

int b = 5;
  
public static void main(String[] args) {

System.out.print("Hi");

System.out.print("Hello World");
// HiHello World

System.out.println("Hi");
System.out.println("Hello World");
// Hi
// Hello World

// 'ln' stands for nextline

  

// for singlr linecomment

/*
*  multi line comment
*/
 

// to print int value you need to store in some variable

// int a = 4;

// here Number 4 is assigning to a variable

// = - used for assigning value to the left side variable

  

System.**_out_**.println(_a_);

// 4

  

// V-5

  

// if you store in some variable then no need to give "" in syso

// if we give variable in "" then java will take as string

  

System.**_out_**.println("a");

// a

  

// Methods: blocks in java class

// once write use multiple times

// public void getData() {}

// getData - Name of block of code or MethodName

// void/int/String - return type of method

// void - doesn't return anything

// public/private - Access Modifiers

// To Call/Execute this method - must be called from main method

  

// No methods are allowed inside main block

// inside class outside main method

  

// create an object for the class where you're method is defined

// and use (objectName) in main method

  

// V-6

// object: instance/reference of a class

  

// allocate memory for that object for class - new keyword use for that

// return type is class only

  

A1Firstclass s = **new** A1Firstclass();

// syntax of an object

  

/**

* A1Firstclass - returnType - Always ClassName s - object reference

* variable/name new - used for memory allocation A1Firstclass() - Object of

* class -

*/

  

s.getData();

// I am in method

System.**_out_**.println(s.b);

// 5

  

// A2Secondclass - class object and calling setData Method

A2Secondclass sc = **new** A2Secondclass();

sc.setData();

// I am in second class method

}

  

**public** **void** getData() {

System.**_out_**.println("I am in method");

// return 2; - int

// return "hello"; - String

}

}
~~~

--------------

A2Secondclass

package a1basic;

public class A2Secondclass {

	public static void main(String[] args) {
	}

	public void setData() {
		System.out.println("I am in second class method");
	}
}

-------------

A3Stringclasseemo

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

---------

A4Reversedemo

package a1basic;

public class A4Reversedemo {

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

		System.out.println(rev);

		if (s.equals("rev")) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}

