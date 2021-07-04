a4abstraction

A1ParentAirCraft


package a4abstraction;

public abstract class A1ParentAirCraft {
	
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

-------

A2ChildEmirates

package a4abstraction;

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
