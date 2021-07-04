a2loops

A1ifElsedemo

package a2loops;

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

-----------

A2Forloopdemo

package a2loops;

public class A2Forloopdemo {

	public static void main(String[] args) {
		
		//Print 1 to 10
		
		/*
		 * for(initialization;condition;increment/dectement)
		 * {
		 * }
		 */
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}

--------------

A3Whiledemo

package a2loops;

public class A3Whiledemo {

	public static void main(String[] args) {
		
		// while loop

		// 1 to 10 print
		/*
		 * while (boolean){ //if condition is true then control will here }
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
	}
}

---------------

A4Dowhiledemo

package a2loops;

public class A4Dowhiledemo {

	public static void main(String[] args) {
		
		int j=0;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
	}
	
	/*
	 * In do while first it's executed 1 time and then
	 * it will check boolean condition
	 * 
	 * 1 loop of execution is guarantee in do while loop 
	 */
}

-------------

A5Nestedloop

package a2loops;

public class A5Nestedloop {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++) {
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}
	}
}

----------------

A6PyramidTriangle

package a2loops;

public class A6PyramidTriangle {

	public static void main(String[] args) {
		
		/*
		 * 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		System.out.println("Hello");
		
		int k=1;
		
		 for(int i=0;i<4;i++)
		 {
			 for(int j=1;j<=4-i;j++) {
				 System.out.print(k);
				 //System.out.print(" ");
				 System.out.print("\t");
				 k++;
			 }
			 //System.out.println();
			 System.out.print("\n");
			 //System.out.println("");
		 }
	}
}
--------------

A7

package a2loops;

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
	}
}
