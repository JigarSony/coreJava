# Polymorphism

```
FunctionOverloading:
Method Overloading: 
Same function name but with different arguments
Either arguments number or arguments data type
should be different
```

## A1FunctionOverloading

```
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
```

## A2FunctionOverriding

```
/*
	 * In Function Overriding: 
	 * Method Overriding: 
	 * Same method name and parameter in
	 * parent class and also in child class 
	 * When child class method will called It give
	 * preference to local method only
	 */
```

```
package a6Polymorphism;
//Video - 28
import a5Inheritance.A1Parentdemo;

public class A2FunctionOverriding extends A1Parentdemo {
	/*
	 * In Function Overriding: 
	 * Method Overriding: 
	 * Same method name and parameter in
	 * parent class and also in child class 
	 * When child class method will called It give
	 * preference to local method only
	 */

	public static void main(String[] args) {

		A2FunctionOverriding fo = new A2FunctionOverriding();
		fo.brakes();
		fo.gear();
		fo.audioSystem();

		A1Parentdemo pd = new A1Parentdemo();
		pd.audioSystem();

		/*
		 * Output: red 
		 * brakes code is implemented 
		 * Gear code is implemented audioSystem
		 * code is implemented
		 */
	}

	public void engine() {
		System.out.println("New engine code is implemented");
	}

	public void audioSystem() {
		System.out.println("New audioSystem code is implemented");
	}
}
```