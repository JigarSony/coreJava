package aa12Exception;
//Video-51
public class A3exceptionDemo {

	public static void main(String[] args) {
		
		int b = 3;
		int c = 0;
		
		
		try {
			int d = b/c;
		System.out.println(d);
		} catch (ArithmeticException ae) {
			System.out.println("I catched the Arithmetic Exception");
		}
		catch (Exception e) {
			System.out.println("I catched the exception");
		}
	}

}
