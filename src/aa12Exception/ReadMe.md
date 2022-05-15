# try-catch-finally

```
 Exception: If feels like any of code suspect/may through an error
If the code gives an error needs to catch them and print message without failing 
 So that can be done via `try-catch` mechanism 
one try can be followed by multiple catch block 
catch block should immediately followed by try block
In catch(Exception e) - is generic exception 
If you want to catch any specific exception then we can mentioned same
Exception name into the same catch block - A3ExceptionDemo
In this try searches for related exception if it's found then catch or else general exception
try{error code}catch(Exception e){}


finally - is a block
So this block will executed irrespective of error exception thrown or not
It'll execute even if there is no error

try{error code}catch(Exception e){}finally{}
```

## A1ExceptionDemo

```
package aa12Exception;

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
```

## A2exceptionDemo

```
package aa12Exception;

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
```

## A3exceptionDemo

```
package aa12Exception;

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
```

## A4finallyDemo

```
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
```