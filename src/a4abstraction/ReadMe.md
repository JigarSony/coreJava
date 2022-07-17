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