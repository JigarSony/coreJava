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