package aa12Exception;

public class A4finallyDemo {
	
	/*
	 *  finally - is a block
	 *  So this block will executed irrespective of error exception thrown or not
	 *   
	 *   It'll execute even if there is no error
	 *   And Finally will not work without catch also
	 */
	
	public static void main(String[] args) {
		
		try {
			int arr[] = new int[5];
			
		System.out.println(arr[7]);
		} catch (ArithmeticException ae) {
			System.out.println("I catched the Arithmetic Exception");
		}
		catch (IndexOutOfBoundsException io) {
			System.out.println("I catched the Index Out Of Bounds Exception");
		}
		catch (Exception e) {
			System.out.println("I catched the exception");
		}
		finally {
			System.out.println("I am in Finally");
		}
	}
	/*
	 * I catched the Index Out Of Bounds Exception
	 * I am in Finally
	 */
}
