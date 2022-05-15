# Super Keyword

```
Generally If Same Variable/Method available in both parent and child class then It gives preference to local variable
WhenEver Parent-child class model also same

If you want to print parent class variable then super keyword comes into the picture
but if same variable Name available in child class then preference goes to child, local variable first

When you say super.<variableName> - Parent class
In Here also if local method is available with same Name
Then - I am in Child Methods
If not then - I am in Parent Methods
If you wanted to call your parent method then put
super.<methodName> in childClass method

//Same thing goes with constructors as well
If I want to use parent class constructor in child class
Simply call super method in child class constructor
Rule: super(); It always be at first line in constructor
```

```
package aa10SuperKeyword;
//Video-46
public class A1ChildDemo extends A2ParentDemo{
	
	String Name = "ABCD";

	public static void main(String[] args) {
		
		A1ChildDemo cd = new A1ChildDemo();
		cd.getStringData();
		//if local variable there then-ABCD
		//If no local variable then-Hello
		
		cd.getData();
	
	}
	
	public void getStringData() {
		System.out.println(Name);
		System.out.println(super.Name);
	}
	//System.out.println(Name);
	//ABCD
	//System.out.println(super.Name);
	//Hello
	
	/*
	 * It gives preference to local variable
	 * WhenEver Parent-child class model also same
	 * 
	 * If you want to print parent class variable then super keyword comes into the picture
	 * 
	 * If you comment String Name = "ABCD";
	 * Then it'll take the Name variable directly from Parent class
	 * Output:
	 * Hello
	 * Hello
	 * 
	 * but if same variable Name available in child class then preference goes to child,local variable first
	 * 
	 * When you say super.Name - Parent class
	 * Name - Child Class
	 */
	
	//Video-47
	
	/*
	 * Created method getData in Parent class
	 * cd.getData()
	 * output:
	 * I am in Parent Method
	 */
	
	public void getData() {
		super.getData();//same as variable to access parent class variable or method use super 
		System.out.println("I am in Child Method");
	}
	
	//I am in Parent Method
	//I am in Child Method"
	
	/*
	 * In Here also if local method is available with same Name
	 * Then - I am in Child Methods
	 * If not then - I am in Parent Methods
	 * 
	 * If you wanted to call your parent method then put
	 * super.getData in childGetData method
	 */
	
	//Same thing goes with constructors as well
	
	public A1ChildDemo() {
		super(); //it always be at first line in constructor
		System.out.println("Child Class Constructor");
	}
	/*
	 * If I want to use parent class constructor in child class
	 * Simply call super method in child class constructor
	 * 
	 * Rule: super(); It always be at first line in constructor
	 */
}

```

```
package aa10SuperKeyword;
//Video-46
public class A2ParentDemo {
	
	String Name = "Hello";

	public static void main(String[] args) {
		
	}
	//Video-47
	
	public void getData() {
		System.out.println("I am in Parent Method");
	}
	
	public A2ParentDemo() {
		System.out.println("Parent Class Constructor");
	}
}
```