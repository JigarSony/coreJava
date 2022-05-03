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