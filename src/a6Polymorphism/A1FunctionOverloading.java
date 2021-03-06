package a6Polymorphism;
//Video - 27
public class A1FunctionOverloading {
	
	/*
	 * FunctionOverloading:
	 * Method Overloading: 
	 * Same function name but with different arguments
	 * Either arguments number or arguments data type
	 * should be different
	 */

	public static void main(String[] args) {
		A1FunctionOverloading fo = new A1FunctionOverloading();
		fo.getData(2);
		fo.getData("a");
		fo.getData(2,3);
		
		//OP
		/*
		 * 2
		 * a
		 * 3
		 */
	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a,int b) {
		System.out.println(b);
	}
}