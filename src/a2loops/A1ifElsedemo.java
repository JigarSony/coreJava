package a2loops;
//Video-11
public class A1ifElsedemo {

	public static void main(String[] args) {
		
		//if..else loop
		/*
		 * if(true){
		 * 	if condition is true then control will here
		 *}else{
		 *	if condition is false then control will here
		 *}
		 */
		
		if(5>2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Success
		
		if(5<2) {
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		//Fail
		
		//If only single line the you can remove brackets 
		
		for(int i = 0;i<=10;i=i+2) {
			if(i==8)
				System.out.println(" 8 is displayed");
			else System.out.println("I didn't Find");
		}
		/*
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
		 * I didn't Find
 		 *   8 is displayed
		 * I didn't Find
		 * 
		 */
	}
}