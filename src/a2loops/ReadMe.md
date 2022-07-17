# A2 Loops

## A1ifElsedemo

```
package a2loops;
//Video-11
public class A1ifElsedemo {
	public static void main(String[] args) {
		
		//if..else loop
		/*
		 * if(true){
		 * 	if condition is true then control will here
		 *}else{
		 *	if condition is false then control will here
		 *}
		 */
		
		if(5>2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Success
		
		if(5<2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Fail
		
		//If only single line the you can remove brackets 
		
		for(int i = 0;i<=10;i=i+2) {
			if(i==8)
				System.out.println(" 8 is displayed");
			else System.out.println("I didn't Find");
		}
		/*
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
 		 *   8 is displayed
		 * I didn't Find
		 * 
		 */
	}
}
```
---
## A2Forloopdemo

```
package a2loops;
//Video-12
public class A2Forloopdemo {
	public static void main(String[] args) {
		
		//Print 1 to 10
		
		/*
		 * for(initialisation;condition;increment/decrement)
		 * {
		 * }
		 */
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		
		/*
		 * For Debugging:
		 * Double click on code - to debug
		 * Then Run into Debug Mode
		 * Then change the layout and play with Step Into and Step Over
		 */
	}
}
```
---
## A3Whiledemo

```
package a2loops;
//Video-13
public class A3Whiledemo {
	public static void main(String[] args) {
		
		// while loop
		// 1 to 10 print
		/*
		 * while (boolean){
		 *  //if condition is true then control will here
		 *  }
		 *  If boolean condition satisfied then goes into loop
		 *  
		 *  1. Boolean Value
		 *  2. do some operation increment/decrement
		 *  If no operation goes in infinite loop
		 */
		while (5 > 3) {
			System.out.println("True");
			break;
		}
		// True
		int k = 3;
		while (5 < k) {
			System.out.println("in side while");
			break;
		}
		System.out.println("outside side while");
		// outside side while
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 */
	}
}
```
---
## A4Dowhiledemo

```
package a2loops;
//Video-14
public class A4Dowhiledemo {
	public static void main(String[] args) {
		/*
		 * In do while first it's executed 1 time and then it will check boolean
		 * condition
		 * 
		 * 1 loop of execution is guaranteed in do while loop
		 */
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		/*
		 * 0 1 2 3 4 5 6 7 8 9
		 */
		int k = 20;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
	}
	// 20
}
```
---
## A5Nestedloop

```
package a2loops;
//Video-16
public class A5Nestedloop {
	public static void main(String[] args) {
		// nested loops works
		for (int i = 1; i <= 4; i++) // (outer loop)this block will loop for 4 times
		{
			System.out.println("outer loop started");
			for (int j = 1; j <= 4; j++) // (inner loops)this block will loop for 4 times
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}
	}
}
```
---
## A6PyramidTriangle

```
package a2loops;
//Video-17
public class A6PyramidTriangle {
	public static void main(String[] args) {
		
		/*
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		System.out.println("Hello");
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				// System.out.print(" ");
				System.out.print("\t");
				k++;
			}
			// System.out.println();
			System.out.print("\n");
			// System.out.println("");
		}
	}
}
```
---
## A7

```
package a2loops;
//Video-18
public class A7 {
	public static void main(String[] args) {
		
		/*
		 * 1 
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 */
		
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("***************");
		
		/*
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 */
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				// k++;
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//OR
		System.out.println("***************");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1);
				System.out.print(" ");
			}
			System.out.println();
		}
		/*
		 * 3 
		 * 6 9 
		 * 12 15 18
		 */
		
		System.out.println("***************");
		
		int l = 3;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(l);
				l = l + 3;
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//OR
		System.out.println("***************");
		
		int m = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(m);
				m = m + 3;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
```
