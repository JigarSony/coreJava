Rahul Shetty : Udemy (https://www.udemy.com/course/core-java-tutorials/learn/lecture/4957334#overview)

Platform Independent - .class file from any other machine able to run different platform as well

JDK: Java Development kit - can run, debug and documents as well

JRE: Java RunTime Environment - can run plain code only

Java - James Gosling - Sun Microsystems - Oracle

Setup Environment Variable - Java_Home and Path Variable

Check the installations - java -version
Code Editor - Eclipse
New > Project > Java Project

src already created
Needs to write class inside this src folder
class: All Java code written in the class

public class xyz
Needs to have same FileName === ClassName

Public static void main?
all the execution of should be place in this methods only
Responsible for Execution

System.out.println - used for print output in console

Sequence

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/1.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/2.png?raw=true)

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

---

# A2 Loops

## A1ifElsedemo

```
package a2loops;
//Video-11
public class A1ifElsedemo {

	public static void main(String[] args) {
		
		//if..else loop
		/*
		 * if(true){
		 * 	if condition is true then control will here
		 *}else{
		 *	if condition is false then control will here
		 *}
		 */
		
		if(5>2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Success
		
		if(5<2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Fail
		
		//If only single line the you can remove brackets 
		
		for(int i = 0;i<=10;i=i+2) {
			if(i==8)
				System.out.println(" 8 is displayed");
			else System.out.println("I didn't Find");
		}
		/*
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
 		 *   8 is displayed
		 * I didn't Find
		 * 
		 */
	}
}
```
---
## A2Forloopdemo

```
package a2loops;
//Video-12
public class A2Forloopdemo {

	public static void main(String[] args) {
		
		//Print 1 to 10
		
		/*
		 * for(initialisation;condition;increment/decrement)
		 * {
		 * }
		 */
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		
		/*
		 * For Debugging:
		 * Double click on code - to debug
		 * Then Run into Debug Mode
		 * Then change the layout and play with Step Into and Step Over
		 */
	}
}
```
---
## A3Whiledemo

```
package a2loops;
//Video-13
public class A3Whiledemo {

	public static void main(String[] args) {
		
		// while loop

		// 1 to 10 print
		/*
		 * while (boolean){
		 *  //if condition is true then control will here
		 *  }
		 *  If boolean condition satisfied then goes into loop
		 *  
		 *  1. Boolean Value
		 *  2. do some operation increment/decrement
		 *  If no operation goes in infinite loop
		 */

		while (5 > 3) {
			System.out.println("True");
			break;
		}
		// True

		int k = 3;
		while (5 < k) {
			System.out.println("in side while");
			break;
		}
		System.out.println("outside side while");
		// outside side while

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 */
	}
}
```
---
## A4Dowhiledemo

```
package a2loops;
//Video-14
public class A4Dowhiledemo {

	public static void main(String[] args) {
		/*
		 * In do while first it's executed 1 time and then it will check boolean
		 * condition
		 * 
		 * 1 loop of execution is guaranteed in do while loop
		 */

		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		/*
		 * 0 1 2 3 4 5 6 7 8 9
		 */

		int k = 20;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
	}
	// 20

}
```
---
## A5Nestedloop

```
package a2loops;
//Video-16
public class A5Nestedloop {

	public static void main(String[] args) {

		// nested loops works

		for (int i = 1; i <= 4; i++) // (outer loop)this block will loop for 4 times
		{
			System.out.println("outer loop started");
			for (int j = 1; j <= 4; j++) // (inner loops)this block will loop for 4 times
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}

	}
}
```
---
## A6PyramidTriangle

```
package a2loops;
//Video-17
public class A6PyramidTriangle {

	public static void main(String[] args) {
		
		/*
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		System.out.println("Hello");

		int k = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				// System.out.print(" ");
				System.out.print("\t");
				k++;
			}
			// System.out.println();
			System.out.print("\n");
			// System.out.println("");
		}
	}
}
```
---
## A7

```
package a2loops;
//Video-18
public class A7 {

	public static void main(String[] args) {
		
		/*
		 * 1 
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 */
		
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("***************");
		
		/*
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 */
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				// k++;
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//OR
		System.out.println("***************");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
				System.out.print(" ");
			}
			System.out.println();
		}

		/*
		 * 3 
		 * 6 9 
		 * 12 15 18
		 */
		
		System.out.println("***************");
		
		int l = 3;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(l);
				l = l + 3;
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//OR
		System.out.println("***************");
		
		int m = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(m);
				m = m + 3;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
```
---
# a3interfacedemo

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/3.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/4.png?raw=true)


## A1CentralTraffic


```
package a3interfacedemo;
//Video-20
public interface A1CentralTraffic {
	
	/*
	 * Interface lies same as class
	 * Interface have methods but not body
	 * in class public void getData(){ }
	 * In Interface we can only defines signature of the method 
	 * We can not write code in method
	 * public void getData()
	 * Why Interface then?
	 * Ex. Traffic Rules
	 * Bank Methods/Rules/Regulations
	 * 
	 * 
	 * Then Classes should define and Implement methods present in Interface
	 * 
	 * Declare Interface?
	 * public interface <InterfaceName>
	 * 
	 * To Implement in Class?
	 * public class <className> implements <interfaceName>
	 * 
	 * We can Implements multiple interface also
	 * public class <className> implements <interfaceName1>, <interfaceName2>
	 * Through this we can achieve/Implement multiple Inheritance
	 * Which directly not supported by JAVA
	 */
	
	public void greenGo();
	//allowed
	
	/*
	 * public void green1() {
	 * }
	 */
	//not allowed
	//method body not allowed
	
	//default and static allowed
	
	
	public void redStop();
	
	public void flashYellow();
	
	//Interface contains variable also
	//but make sure it's public
	//by default access modifiers /nature is public
	
	 int a = 4;
}
```

## A2ContinentTraffic

```
package a3interfacedemo;
//Video-21
public interface A2ContinentTraffic {
	
	public void trainSymbol();

}
```

## A3AustralianTraffic

```
package a3interfacedemo;
//Video-20,21
public class A3AustralianTraffic implements A1CentralTraffic, A2ContinentTraffic {
	
	//to implements any interface to class
	//keyword implements <InterfaceName>
	//for multiple interface implementation use implements <Interface1,Interface2>
	
	public static void main(String[] args) {
		
		A1CentralTraffic at = new A3AustralianTraffic();
		//top casting
		
		at.greenGo();
		at.redStop();
		at.flashYellow();
		//at.walkingSymbol();
		//not work
		//at.trainSymbol();
		//not work
		
		//O/P
		//greenGo Implementation
		//redStop Implementation
		//flashYellow Implementation
		
		A3AustralianTraffic att = new A3AustralianTraffic();
		//object created of class
		
		att.walkingSymbol();
		//OP
		//Walking Symbol
		

		A2ContinentTraffic ct = new A3AustralianTraffic();
		//top casting
		//OP
		//train Symbol
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implementation");
	}
	
	//in this class you can implement interface methods as well separate methods also
	
	public void walkingSymbol() {
		System.out.println("Walking Symbol");
		
		//can not call this methods by 
		//CentralTraffic at = new AustralianTraffic(); this object
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("train Symbol");
	}
}
```
---
# a4abstraction

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/5.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/6.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/7.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/8.png?raw=true)

## A1ParentAirCraft
---
```
package a4abstraction;
//Video-23
public abstract class A1ParentAirCraft {
	
	/*
	 * Abstraction: Hiding Implementation
	 * What Object does rather then how it does
	 * 
	 * Abstract class contains abstract and Non-Abstract methods
	 * Partial abstraction
	 * 
	 * for NonAbstract Method - Extended Class can be Implements
	 * 
	 * How to Define?
	 * public abstract class <className>
	 * 
	 * How to Use in other class?
	 * 
	 * public class <className> extends <abstractClassName>
	 */
	
	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}
	//non abstract method
	//non concrete method

	public void safetyGuidelines() {
		System.out.println("Follow safety Guidelines");
	}
	
	public abstract void bodyColor();
	//abstract method
	//concrete method
	
	//for this method need to update class to abstract
	
	//private abstract void abc();
	//private is not allowed
	//only public and protected allowed
	//
	//Point of abstraction
	//Every abstract class have to be inherited 
}
```
## A2ChildEmirates
---
```
package a4abstraction;
//Video-23
public class A2ChildEmirates extends A1ParentAirCraft {

	public static void main(String[] args) {
		A2ChildEmirates c = new A2ChildEmirates();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		//OP
//		Follow Engine Guidelines
//		Follow safety Guidelines
//		Follow bodyColor Guidelines
		
		//A1ParentAirCraft ac = new A1ParentAirCraft();
		//can not create object of an abstract class
	}
	
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Follow bodyColor Guidelines");
	}

}
```
---

# Inheritance

```Parent - Child Concept
We can get all methods in child class by extending parent class in child class

 > Syntax: public class <childClass> extends <parentClass>
 ```
 
 ![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/9.png?raw=true)
 
 ~~~
 Java Does not allowed multiple Inheritance
 
 For that we're using Interface
 ~~~
 
 ![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/10.png?raw=true)
 
 
 ![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/11.png?raw=true)
 
## A1Parentdemo
 
 ```
package a5Inheritance;
//Video - 24
public class A1Parentdemo {

	String color = "red";

	public static void main(String[] args) {

	}

	public void gear() {
		System.out.println("Gear code is implemented");
	}
	
	public void brakes() {
		System.out.println("brakes code is implemented");
	}
	
	public void audioSystem() {
		System.out.println("audioSystem code is implemented");
	}
}
 ```
 
## A2Childdemo
 
 ```
 package a5Inheritance;
//Video - 24
public class A2Childdemo extends A1Parentdemo {

	public static void main(String[] args) {
		A2Childdemo cd = new A2Childdemo();
		cd.getColor();
		cd.brakes();
		cd.gear();
		cd.audioSystem();
		
		//OP
//		red
//		brakes code is implemented
//		Gear code is implemented
//		audioSystem code is implemented
	}
	
	public void engine() {
		System.out.println("New engine code is implemented");
	}
	
	public void getColor() {
		System.out.println(color);
	}
	
	//In Java can not allowed multiple inheritance
	//class a(){}
	//class b(){}
	//class c() extends a,b{} -- no no not allowed
}
 ```
 ---
 
 # Polymorphism

```
FunctionOverloading:
Method Overloading: 
Same function name but with different arguments
Either arguments number or arguments data type
should be different
```

## A1FunctionOverloading

```
package a6Polymorphism;
//Video - 27
public class A1FunctionOverloading {
	
	/*
	 * FunctionOverloading:
	 * Method Overloading: 
	 * Same function name but with different arguments
	 * Either arguments number or arguments data type
	 * should be different
	 */

	public static void main(String[] args) {
		A1FunctionOverloading fo = new A1FunctionOverloading();
		fo.getData(2);
		fo.getData("a");
		fo.getData(2,3);
		
		//OP
		/*
		 * 2
		 * a
		 * 3
		 */
	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a,int b) {
		System.out.println(b);
	}
}
```

## A2FunctionOverriding

```
/*
	 * In Function Overriding: 
	 * Method Overriding: 
	 * Same method name and parameter in
	 * parent class and also in child class 
	 * When child class method will called It give
	 * preference to local method only
	 */
```

```
package a6Polymorphism;
//Video - 28
import a5Inheritance.A1Parentdemo;

public class A2FunctionOverriding extends A1Parentdemo {
	/*
	 * In Function Overriding: 
	 * Method Overriding: 
	 * Same method name and parameter in
	 * parent class and also in child class 
	 * When child class method will called It give
	 * preference to local method only
	 */

	public static void main(String[] args) {

		A2FunctionOverriding fo = new A2FunctionOverriding();
		fo.brakes();
		fo.gear();
		fo.audioSystem();

		A1Parentdemo pd = new A1Parentdemo();
		pd.audioSystem();

		/*
		 * Output: red 
		 * brakes code is implemented 
		 * Gear code is implemented audioSystem
		 * code is implemented
		 */
	}

	public void engine() {
		System.out.println("New engine code is implemented");
	}

	public void audioSystem() {
		System.out.println("New audioSystem code is implemented");
	}
}
```
---

# Array

```
If I want to store multiple  values into a single containers then we can use array
A container which store multiple value of same data types
```

## A1Arraydemo

```
package a7Array;
//Video - 30,31
public class A1Arraydemo {

	public static void main(String[] args) {
		
		/*
		 * int a = 4;
		 * this is a single variable
		 * If I want to store multiple  values into a single containers then we can use array
		 * A container which store multiple value of same data types
		 * [] - Indicates terms for an array
		 */
		
		//Instantiating array
		//allocating memory and then 
		int a [] = new int [5];
		/*
		 * declare an array and allocates memory for the value
		 * here I am allocating memory first and then assigning value
		 * Allocate [5] integer value in integer a array 
		 * new - keyword used to allocate memory
		 */
		
		a[0]=2;
		a[1]=6;
		a[2]=3;
		a[3]=4;
		a[4]=5;//initialised values into that array
		
		//array start from 0;
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]); //retrieve values present in this array
		}
		
		/* output:
		 * 2
		 * 6
		 * 3
		 * 4
		 * 5
		 */
		
		System.out.println("*******************");
//Video - 31
		//Another way to declare an array
		//array literal
		
		int b [] = {1,4,6,8,10};
		//here I am directly passing the value in array
		//memory dynamically allocated
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		/* output:
		 * 1
		 * 4
		 * 6
		 * 8
		 * 10
		 */
	}
}
```

## A2MultiDimensionArraydemo

```
package a7Array;
//Video-31,33
public class A2MultiDimensionArraydemo {
	//multi dimension array
	//matrix kind of things

	public static void main(String[] args) {
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(b[2][0]);
		//7
		
		System.out.println("****************");
		//2 4 6
		//3 9 12
		//4 16 64
		
		int a [][] = new int[2][3];
		//a[row][column]
		//a [x-axis] [y-axis]
		
		//first row
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		//second row
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		System.out.println(a[1][0]);
		//4
		
		System.out.println("****************");
		
		for(int i=0;i<a.length;i++) {//row
			for(int j=0;j<a[i].length;j++) {//column
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		//1 2 3
		//4 5 6 		
	}
}
```

## A3ArrayFindMinNumber

```
package a7Array;
//Video-34
public class A3ArrayFindMinNumber {
	//Find Minimum Number from this Matrix
	public static void main(String[] args) {
		int abc[][] = {{2,4,5},{3,1,7},{-1,2,0}};
		int min = abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if(abc[i][j]<min) {
					min = abc[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println(min);
	}
}
```

## A4arryFindMaxNumber

```
package a7Array;
//Video-34
public class A4arryFindMaxNumber {
	//Find Maximum Number from this Matrix
	public static void main(String[] args) {
		
		/*
		 * 	2 4 5 
			3 1 7 
			-1 2 0 
		 */
		int abc[][] = { { 2, 4, 5 }, { 3, 1, 7 }, { -1, 2, 0 } };
		int max = abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if (abc[i][j] > max) {
					max = abc[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println(max);
	}
}
```

## A5CiscoIQ

```
package a7Array;
//Video-35
public class A5CiscoIQ {

	public static void main(String[] args) {
		/*
		 * Find out the minimum number,
		 * Get Minimum number's column,
		 * From that column Find maximum number
		 */
		
		/*
		 *  2 4 5 
			3 1 7 
			-1 2 0 
		 */
		
		int abc[][] = { { 2, 4, 5 }, { 3, 1, -5 }, { -1, 2, -2 } };
		int min = abc[0][0];
		int minColumn = 0;
		int maxNumb=abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if (abc[i][j] < min) {
					min = abc[i][j];
					minColumn = j;
				}
			}
			System.out.println("");
		}
		System.out.println(min);
		System.out.println(minColumn);
		
		//Way 1
		for(int k=0;k<abc.length;k++) {
			System.out.println(abc[k][minColumn]);
//			System.out.print(" ");
			
			if (abc[k][minColumn] > maxNumb) {
				maxNumb = abc[k][minColumn];
			}
		}
		System.out.println("*****");
		System.out.println(maxNumb);
		
		
		System.out.println("*****");
		
		//Way 2
		
		int max = abc[0][minColumn];
		int l = 0;
		
		while(l<3) {
			if(abc[l][minColumn]>max) {
				max= abc[l][minColumn];
			}
			l++;
		}
		System.out.println(max);
	}
}
```

## A6SwapNumbers

```
package a7Array;
//Video-37
public class A6SwapNumbers {
//how to swap two Numbers with/without temp/any variable	
	
	public static void main(String[] args) {
	//first swapping concept with temp variable
		
		int a = 4;
		int b = 5;
		/*
		 * output:
		 * a=5;
		 * b=4;
		 */
		
		//defining temporary variable
		int temp;
		
		//moving/assigning a value to temp
		temp=a;
		
		//moving/assigning b value to a
		a=b;
		
		//assigning temp value to b
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		//5
		//4
		
		
		//Swap number without using temp variable
		
		/*
		 * a=5;
		 * b=4;
		 * 
		 * output:
		 * b=4;
		 * a=5;
		 */
		
		a = a+b; //a=5+4=9
		b = a-b; //b=9-4=5
		a = a-b; //a=9-5=4
		
	}

}
```

## A7SortArray (Bubble Sort)

```
package a7Array;
//Video-38
public class A7SortArray {
//how to sort array

	public static void main(String[] args) {
		int a[] = {2,6,1,4,9};
		int temp;
		//op: {1,2,4,6,9}
		
		/*
		 * Bubble Sort
		 * 2,6,1,4,9
		 * 
		 * take first index 2 and compare with rest 6,1,4,9
		 * if got any minimum value swap it and continue the comparison
		 * once done increment index by 1 and repeat the same
		 */
		
		
		for(int i = 0; i < a.length; i++) {//index
			
			for(int j = i+1; j < a.length; j++) {//rest dataset
				//compare and swap
				//compare
				if(a[i] > a[j]) {
					//swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
```
--