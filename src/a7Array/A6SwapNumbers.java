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
