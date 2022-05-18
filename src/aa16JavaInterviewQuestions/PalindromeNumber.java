package aa16JavaInterviewQuestions;

public class PalindromeNumber {
//https://www.youtube.com/watch?v=XGs7rrv-baA
	//https://www.youtube.com/watch?v=8BlUi4-4N4E -- String
	public static void main(String[] args) {
		isPalindromeNumber(121);
		isPlaindromeString("MADAM");
	}

	public static void isPalindromeNumber(int num) {

		int r=0;
		int sum=0;
		int t;

		t=num;

		while (num>0) {
			r=num%10;
			//System.out.println(r);
			sum=(sum*10)+r;
			//System.out.println(sum);
			num=num/10;
			//System.out.println(num);
		}
		if (t==sum) {
			System.out.println("This is Palindrome Number");
		}else {
			System.out.println("This is not Palindrome Number");
		}
	}
//https://www.youtube.com/watch?v=8BlUi4-4N4E
	public static void isPlaindromeString(String str){

		String org_String = str;
		String rev_String;

		StringBuffer sf = new StringBuffer(str);
		sf = sf.reverse();
		rev_String = sf.toString();

		//System.out.println(rev_String);

		if (org_String.equals(rev_String)){
			System.out.println(str + " This is Palindrome String");
		}else {
			System.out.println(str + " This is not Palindrome String");
		}
	}
}
