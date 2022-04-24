package a1basic;

public class A1Firstclass {
	// Video-1 - Intro
	// Video-2 - Java Installation
	// Video-3 - Eclipse Installation
	/**
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

		/**
		 * to print int value you need to store in some variable
		 * and use (objectName) in main method
		 * here Number 4 is assigning to a variable
		 * = - used for assigning value to the left side variable
		 */ 

		System.out.println(a);
		// 4

		// Video-5

		// if you store in some variable then no need to give "<variableName>" in syso
		// if we give variable in "" then java will take as string

		System.out.println("a");
		// a

		/**
		 *  Methods: blocks in java class
		 *  once write use multiple times
		 *  public void getData() {}
		 *  getData - Name of block of code or MethodName
		 *  void/int/String - return type of method
		 *  void - doesn't return anything
		 *  public/private - Access Modifiers
		 *  To Call/Execute this method - must be called from main method
		 */
		
		/**
		 * Why Methods? - to avoid same code multiple times or duplicates
		 * We can create one block and call whenEver required 
		 */

		/**
		 *  No methods are allowed inside main block
		 *  inside class outside main method
		 */
		
		/**
		 *  How do you get created method in Main method?
		 *  create an object for the class where you're method is defined
		 *  and use (objectName) in main method
		 */

		// Video-6
		// object: instance/reference of a class
		// we can call variable/methods inside class
		// new keyword use for - to allocate memory for that object for class
		// return type is class only

		A1Firstclass s = new A1Firstclass();
		// syntax of an object

		/**
		 * A1Firstclass - returnType - Always ClassName 
		 * s - object reference variable/name
		 * new - used for memory allocation A1Firstclass() - Object of
		 * class - A1Firstclass();
		 */

		s.getData();
		// I am in method
		System.out.println(s.b);
		// 5
		//variable value
		
		//File - A2Secondclass
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