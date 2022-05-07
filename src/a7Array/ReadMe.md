# Array

```
If I want to store multiple  values into a single containers then we can use array
A container which store multiple value of same data types
```

## A1Arraydemo

```
package a7Array;
//Video - 30,31
public class A1Arraydemo {

	public static void main(String[] args) {
		
		/*
		 * int a = 4;
		 * this is a single variable
		 * If I want to store multiple  values into a single containers then we can use array
		 * A container which store multiple value of same data types
		 * [] - Indicates terms for an array
		 */
		
		//Instantiating array
		//allocating memory and then 
		int a [] = new int [5];
		/*
		 * declare an array and allocates memory for the value
		 * here I am allocating memory first and then assigning value
		 * Allocate [5] integer value in integer a array 
		 * new - keyword used to allocate memory
		 */
		
		a[0]=2;
		a[1]=6;
		a[2]=3;
		a[3]=4;
		a[4]=5;//initialised values into that array
		
		//array start from 0;
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]); //retrieve values present in this array
		}
		
		/* output:
		 * 2
		 * 6
		 * 3
		 * 4
		 * 5
		 */
		
		System.out.println("*******************");
//Video - 31
		//Another way to declare an array
		//array literal
		
		int b [] = {1,4,6,8,10};
		//here I am directly passing the value in array
		//memory dynamically allocated
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		/* output:
		 * 1
		 * 4
		 * 6
		 * 8
		 * 10
		 */
	}
}
```

## A2MultiDimensionArraydemo

```
package a7Array;
//Video-31,33
public class A2MultiDimensionArraydemo {
	//multi dimension array
	//matrix kind of things

	public static void main(String[] args) {
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(b[2][0]);
		//7
		
		System.out.println("****************");
		//2 4 6
		//3 9 12
		//4 16 64
		
		int a [][] = new int[2][3];
		//a[row][column]
		//a [x-axis] [y-axis]
		
		//first row
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		//second row
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		System.out.println(a[1][0]);
		//4
		
		System.out.println("****************");
		
		for(int i=0;i<a.length;i++) {//row
			for(int j=0;j<a[i].length;j++) {//column
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		//1 2 3
		//4 5 6 		
	}
}
```

## A3ArrayFindMinNumber

```
package a7Array;
//Video-34
public class A3ArrayFindMinNumber {
	//Find Minimum Number from this Matrix
	public static void main(String[] args) {
		int abc[][] = {{2,4,5},{3,1,7},{-1,2,0}};
		int min = abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if(abc[i][j]<min) {
					min = abc[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println(min);
	}
}
```

## A4arryFindMaxNumber

```
package a7Array;
//Video-34
public class A4arryFindMaxNumber {
	//Find Maximum Number from this Matrix
	public static void main(String[] args) {
		
		/*
		 * 	2 4 5 
			3 1 7 
			-1 2 0 
		 */
		int abc[][] = { { 2, 4, 5 }, { 3, 1, 7 }, { -1, 2, 0 } };
		int max = abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if (abc[i][j] > max) {
					max = abc[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println(max);
	}
}
```

## A5CiscoIQ

```
package a7Array;
//Video-35
public class A5CiscoIQ {

	public static void main(String[] args) {
		/*
		 * Find out the minimum number,
		 * Get Minimum number's column,
		 * From that column Find maximum number
		 */
		
		/*
		 *  2 4 5 
			3 1 7 
			-1 2 0 
		 */
		
		int abc[][] = { { 2, 4, 5 }, { 3, 1, -5 }, { -1, 2, -2 } };
		int min = abc[0][0];
		int minColumn = 0;
		int maxNumb=abc[0][0];

		for (int i = 0; i < abc.length; i++) {// row
			for (int j = 0; j < abc[i].length; j++) {// column
				System.out.print(abc[i][j]);
				System.out.print(" ");
				if (abc[i][j] < min) {
					min = abc[i][j];
					minColumn = j;
				}
			}
			System.out.println("");
		}
		System.out.println(min);
		System.out.println(minColumn);
		
		//Way 1
		for(int k=0;k<abc.length;k++) {
			System.out.println(abc[k][minColumn]);
//			System.out.print(" ");
			
			if (abc[k][minColumn] > maxNumb) {
				maxNumb = abc[k][minColumn];
			}
		}
		System.out.println("*****");
		System.out.println(maxNumb);
		
		
		System.out.println("*****");
		
		//Way 2
		
		int max = abc[0][minColumn];
		int l = 0;
		
		while(l<3) {
			if(abc[l][minColumn]>max) {
				max= abc[l][minColumn];
			}
			l++;
		}
		System.out.println(max);
	}
}
```

## A6SwapNumbers

```
package a7Array;
//Video-37
public class A6SwapNumbers {
//how to swap two Numbers with/without temp/any variable	
	
	public static void main(String[] args) {
	//first swapping concept with temp variable
		
		int a = 4;
		int b = 5;
		/*
		 * output:
		 * a=5;
		 * b=4;
		 */
		
		//defining temporary variable
		int temp;
		
		//moving/assigning a value to temp
		temp=a;
		
		//moving/assigning b value to a
		a=b;
		
		//assigning temp value to b
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		//5
		//4
		
		
		//Swap number without using temp variable
		
		/*
		 * a=5;
		 * b=4;
		 * 
		 * output:
		 * b=4;
		 * a=5;
		 */
		
		a = a+b; //a=5+4=9
		b = a-b; //b=9-4=5
		a = a-b; //a=9-5=4
		
	}

}
```

## A7SortArray (Bubble Sort)

```
package a7Array;
//Video-38
public class A7SortArray {
//how to sort array

	public static void main(String[] args) {
		int a[] = {2,6,1,4,9};
		int temp;
		//op: {1,2,4,6,9}
		
		/*
		 * Bubble Sort
		 * 2,6,1,4,9
		 * 
		 * take first index 2 and compare with rest 6,1,4,9
		 * if got any minimum value swap it and continue the comparison
		 * once done increment index by 1 and repeat the same
		 */
		
		
		for(int i = 0; i < a.length; i++) {//index
			
			for(int j = i+1; j < a.length; j++) {//rest dataset
				//compare and swap
				//compare
				if(a[i] > a[j]) {
					//swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
```