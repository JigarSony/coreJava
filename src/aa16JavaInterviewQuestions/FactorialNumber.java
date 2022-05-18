package aa16JavaInterviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(fact(4));
	}

	//fact 3 = 3*2*1=6
	//fact 4 = 4*3*2*1=24

	//1. WIth out recursive
	//Non Recursive way
	public static int factorial(int num) {
		int fact = 1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	//2. Recursive : function call it self
	public static int fact(int num) {
		if(num == 0)
			return 1;
		else {
			return(num *fact(num-1));
		}
	}
}