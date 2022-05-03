package a5Inheritance;
//Video - 24
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
