# Final KeyWord

```
If you declare any variable to final 
Then you can not change the value again
through an error
Constant variable
class can be final - 
Cannot use as parent class
final class A1Final {}
method can be final - 
If you mark method as final then cannot override it again
final void getData(){}
```

```
package aa14FinalKeyword;

public class A1Final {
	
	/*
	 * If you declare any variable to final 
	 * Then you can not change the value again
	 * through an error
	 * 
	 * Constant variable
	 * 
	 * class can be final - 
	 * If you mark class as final then cannot extend that class
	 * Cannot use as parent class
	 * 
	 * final class A1Final {}
	 * 
	 * method can be final - 
	 * If you mark method as final then cannot override it again
	 * 
	 * final void getData(){}
	 * 
	 */

	public static void main(String[] args) {
		
		final int i = 4;
		
		//i = 5;
		//If i do this then Error
		//Remove final modifier of i
	}
}
```