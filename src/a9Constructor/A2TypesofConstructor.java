package a9Constructor;
//Video-44
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
