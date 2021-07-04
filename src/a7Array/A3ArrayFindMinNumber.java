package a7Array;

public class A3ArrayFindMinNumber {

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
