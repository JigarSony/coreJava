package a2loops;
//Video-16
public class A5Nestedloop {

	public static void main(String[] args) {

		// nested loops works

		for (int i = 1; i <= 4; i++) // (outer loop)this block will loop for 4 times
		{
			System.out.println("outer loop started");
			for (int j = 1; j <= 4; j++) // (inner loops)this block will loop for 4 times
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}

	}
}