package a1basic;

public class A1Firstclass {
	
	static int a =4;

	public static void main(String[] args) {
		System.out.print("Hi");
		System.out.print("Hello World");
		//HiHello World
		
		System.out.println("Hi");
		System.out.println("Hello World");
		//Hi
		//Hello World
		
		//'ln' stands for nextline
		
		// for comment
		
		/*
		 *  // multi line comment
		 */
		
		//to print int value you need to store in some variable
		//int a =4;
		
		System.out.println(a);
		//4
		
		//if you store in some variable then no need to give "" in syso
		//if we give variable in  "" then java will take as string
		
		System.out.println("a");
		//a
		
		//Methods: block in java
		//once write use multiple times
		
		//no methods are allowed inside main block
		//inside class ouside main
		//create an object and use in method
		
		//objects: instance/reference of a class
		
		//allocate memory for that object for class - new keyword use for that
		//return type is class only
		
		A1Firstclass s = new A1Firstclass();
		//syntax of an object
		
		s.getData();
		//I am in method
		
		A2Secondclass sc = new A2Secondclass();
		sc.setData();
		//I am in second class method
	}
	
	public void getData() {
		System.out.println("I am in method");
		//return 2; int
		//return hello String
	}
}