package aa12Exception;
//Video-51
public class A2exceptionDemo {

	public static void main(String[] args) {
		
		int b = 3;
		int c = 0;
		
		
		try {
			int d = b/c;
		System.out.println(d);
		} catch (Exception e) {
			System.out.println("I catched the exception");
		}
	}

}
