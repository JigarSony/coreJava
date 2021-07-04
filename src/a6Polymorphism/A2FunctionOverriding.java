package a6Polymorphism;

import a5Inheritance.A1Parentdemo;

public class A2FunctionOverriding extends A1Parentdemo {

	public static void main(String[] args) {

		A2FunctionOverriding fo = new A2FunctionOverriding();
		fo.brakes();
		fo.gear();
		fo.audioSystem();
		
		A1Parentdemo pd = new A1Parentdemo();
		pd.audioSystem();

		//OP
//		red
//		brakes code is implemented
//		Gear code is implemented
//		audioSystem code is implemented
	}

	public void engine() {
		System.out.println("New engine code is implemented");
	}
	
	public void audioSystem() {
		System.out.println("New audioSystem code is implemented");
	}
	
	//In Function overriding 
	//Same method name and parameter in parent class and also in child class
	//child class method will called
	//preference to local method only
	
}
