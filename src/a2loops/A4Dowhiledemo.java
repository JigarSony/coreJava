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
