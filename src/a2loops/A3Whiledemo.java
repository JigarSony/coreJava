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