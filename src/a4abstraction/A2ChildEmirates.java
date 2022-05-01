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
