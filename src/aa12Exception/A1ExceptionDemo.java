package aa12Exception;
//Video-50
public class A1ExceptionDemo {
	
	int a = 4;
	
	/*
	 * Exception: If feels like any of code suspect/may through an error
	 * 
	 * If the code gives an error needs to catch them and print message without failing 
	 * So that can be done via `try-catch` mechanism 
	 * 
	 * one try can be followed by multiple catch block 
	 * catch block should immediately followed by try block
	 * 
	 * In catch(Exception e) - is generic exception 
	 * If you want to catch any specific exception then we can mentioned same
	 * Exception name into the same catch block - A3ExceptionDemo
	 * 
	 * In this try searches for related exception if it's found then catch or else general exception
	 */

	int b = 3;
	int c = 0;
	
	int d = b/c;
	
	public void getData() {
		System.out.println(d);
	}
	
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	 * at aa12Exception.A1ExceptionDemo.<init>(A1ExceptionDemo.java:18)
	 * at aa12Exception.A1ExceptionDemo.main(A1ExceptionDemo.java:25)
	 */
	
	public static void main(String[] args) {
		
		A1ExceptionDemo ed = new A1ExceptionDemo();
		ed.getData();
	}

}