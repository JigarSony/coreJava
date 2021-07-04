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
