package a7Array;

public class A1Arraydemo {

	public static void main(String[] args) {
		
		//int a = 4;
		//this is a single variable
		//If I want to store multiple  values into a single containers then we can use array
		//A container which store multiple value of same data types
		
		int a [] = new int [5];
		//declare an array and allocates memory for the value
		//here I am allocating memory first and then assigning value
		
		a[0]=2;
		a[1]=6;
		a[2]=3;
		a[3]=4;
		a[4]=5;//initialised values into that array
		
		//array start from 0;
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]); //retrieve values present in this array
		}
		
		System.out.println("*******************");
		
		//Another way to declare an array
		//array literal
		
		int b [] = {1,4,6,8,10};
		//here I am directly passing the value in array
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
