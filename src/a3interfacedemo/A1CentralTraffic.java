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