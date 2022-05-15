package a9Constructor;
//Video-43
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
