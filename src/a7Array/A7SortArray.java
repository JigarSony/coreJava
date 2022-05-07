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
