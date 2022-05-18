package aa16JavaInterviewQuestions;


public class ArmStrongNumber {

	public static void main(String[] args) {
		isArmStrongNumber(153);
//		isArmStrongNumber(1);
//		isArmStrongNumber(0);
//		isArmStrongNumber(370);
//		isArmStrongNumber(371);
//		isArmStrongNumber(407);

	}
	
	public static void isArmStrongNumber(int num) {
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		System.out.println("The Given Number is: " +num);
		
		int cube = 0;
		int r;
		int t;
		
		t = num;
		
		while (num>0) {
			r = num%10;  //gives last digit of any number
			//System.out.println(r);
			num = num/10; //delete last digit of any number
			//System.out.println(num);
			cube = cube+(r*r*r);
			//System.out.println(cube);
		}
		
		if(t == cube) {
			System.out.println("The Given Number is an ArmStrongNumber");
		}else {
			System.out.println("The Given Number is not an ArmStrongNumber");
		}
	}
}
