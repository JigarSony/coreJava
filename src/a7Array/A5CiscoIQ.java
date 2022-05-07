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
