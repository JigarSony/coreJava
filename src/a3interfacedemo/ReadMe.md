# a3interfacedemo

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/3.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/4.png?raw=true)


## A1CentralTraffic


```
package a3interfacedemo;
//Video-20
public interface A1CentralTraffic {
	
	/*
	 * Interface lies same as class
	 * Interface have methods but not body
	 * in class public void getData(){ }
	 * In Interface we can only defines signature of the method 
	 * We can not write code in method
	 * public void getData()
	 * Why Interface then?
	 * Ex. Traffic Rules
	 * Bank Methods/Rules/Regulations
	 * 
	 * 
	 * Then Classes should define and Implement methods present in Interface
	 * 
	 * Declare Interface?
	 * public interface <InterfaceName>
	 * 
	 * To Implement in Class?
	 * public class <className> implements <interfaceName>
	 * 
	 * We can Implements multiple interface also
	 * public class <className> implements <interfaceName1>, <interfaceName2>
	 * Through this we can achieve/Implement multiple Inheritance
	 * Which directly not supported by JAVA
	 */
	
	public void greenGo();
	//allowed
	
	/*
	 * public void green1() {
	 * }
	 */
	//not allowed
	//method body not allowed
	
	//default and static allowed
	
	
	public void redStop();
	
	public void flashYellow();
	
	//Interface contains variable also
	//but make sure it's public
	//by default access modifiers /nature is public
	
	 int a = 4;
}
```

## A2ContinentTraffic

```
package a3interfacedemo;
//Video-21
public interface A2ContinentTraffic {
	
	public void trainSymbol();

}
```

## A3AustralianTraffic

```
package a3interfacedemo;
//Video-20,21
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
		//greenGo Implementation
		//redStop Implementation
		//flashYellow Implementation
		
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
```

