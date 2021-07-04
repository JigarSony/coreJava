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