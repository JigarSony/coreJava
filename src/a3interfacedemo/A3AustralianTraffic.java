package a3interfacedemo;

public class A3AustralianTraffic implements A1CentralTraffic, A2ContinentTraffic {
	
	//to implements any interface to class
	//keyword implements <InterfaceName>
	//for multiple interface implementation use implements <Interface1,Interface2>
	
	public static void main(String[] args) {
		
		A1CentralTraffic at = new A3AustralianTraffic();
		//top casting
		
		at.greenGo();
		at.redStop();
		at.flashYellow();
		//at.walkingSymbol();
		//not work
		//at.trainSymbol();
		//not work
		
		//O/P
//		greenGo Implementation
//		redStop Implementation
//		flashYellow Implementation
		
		A3AustralianTraffic att = new A3AustralianTraffic();
		//object created of class
		
		att.walkingSymbol();
		//OP
		//Walking Symbol
		

		
		A2ContinentTraffic ct = new A3AustralianTraffic();
		//top casting
		//OP
		//train Symbol
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow Implementation");
	}
	
	//in this class you can implement interface methods as well separate methods also
	
	public void walkingSymbol() {
		System.out.println("Walking Symbol");
		
		//can not call this methods by 
		//CentralTraffic at = new AustralianTraffic(); this object
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("train Symbol");
	}
}