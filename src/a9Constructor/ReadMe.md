# Constructor

```
What is Constructor?:
Constructor executes block of code
WhenEver an object is created
Constructor is invoke whenever you create an object

Where is and how can we define it?
constructor is written just like a method
only difference between constructor and method is 
Constructor not written any values.
And Name of Constructor always should be same as className only 

What we write in constructor will be executed
Whoever creates an object of the class
This is the main aim of constructor

Whenever this line/object is define automatically it's check for 
is there any constructor explicitly define?
if it define then it's execute particular block
In short when ever you create an object constructor is called

If I comment that constuctor part
Still Programs will run? - Yes
but Internally if you don't called any constructor compiler will called
Default Constructor/Implicit Constructors

```
## a9Constructor

## A1ConstructorDemo

```
package a9Constructor;

public class A1ConstructorDemo {

	public static void main(String[] args) {
		/*
		 * What is Constructor?:
		 * Constructor executes block of code
		 * WhenEver an object is created
		 * 
		 * Constructor is invoke whenever you create an object
		 * 
		 * Where is and how can we define it?
		 * 
		 * constructor is written just like a method
		 * only difference between constructor and method is 
		 * Constructor not written any values.
		 * 
		 * And Name of Constructor always should be same as className only
		 * 
		 * What we write in constructor will be executed
		 * WhoEver creates an object of the class
		 * 
		 * This is the main aim of constructor
		 */
		
		A1ConstructorDemo ab = new A1ConstructorDemo();
		/*
		 * Whenever this line/object is define automatically it's check for 
		 * is there any constructor explicitly define?
		 * 
		 * if it define then it's execute particular block
		 * 
		 * In short when ever you create an object constructor is called
		 */
		
		
		/* Till now I didn't called any methods
		 * output:
		 * I am in the constructor
		 */
		
		/*
		 * If I comment that constuctor part
		 * public A1ConstructorDemo() {
		 * System.out.println("I am in the constructor");
		 *	}
		 *	
		 *Still Programs will run? - Yes
		 *
		 *but Internally if you don't called any constructor compiler will called
		 *Default Constructor/Implicit Constructors
		 */
		
	}
	
	public A1ConstructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	public void getData() {
		System.out.println("I am in the method");
	}
}
```

## A2TypesofConstructor

```
If there're no constructor is defined 
Then only Java compiler will go and take implicit constructor

If any other constructor is defined in code 
Then Java compiler will not go and not take/hit any implicit constructor
```

```
package a9Constructor;

public class A2TypesofConstructor {
	/*
	 * If there're no constructor is defined 
	 * Then only Java compiler will go and take implicit constructor
	 * 
	 * If any other constructor is defined in code 
	 * Then Java compiler will not go and not take/hit any implicit constructor
	 */
	public static void main(String[] args) {
		
		A2TypesofConstructor tc = new A2TypesofConstructor();
		//it'll executes default Constructor
		//I am in Constructor
		
		A2TypesofConstructor tc1 = new A2TypesofConstructor("Hello");
		//it'll executes single parameterised Constructor
		//Hello
		
		A2TypesofConstructor tc2 = new A2TypesofConstructor(1,2);
		//it'll executes multi parameterised Constructor
		//I am in Multi Parameterised Constructor
	}
	
	//Default Constructor
	public A2TypesofConstructor() {
		System.out.println("I am in Constructor");
	}
	
	//Single Parameterised Constructor
	public A2TypesofConstructor(String str) {
		System.out.println(str);
	}
	
	//Multi Parameterised Constructor
	public A2TypesofConstructor(int a, int b) {
		System.out.println("I am in Multi Parameterised Constructor");
	}
}
```