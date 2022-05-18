package aa16JavaInterviewQuestions;

public class A1ReverseString {
//https://www.youtube.com/watch?v=exzJoArl0h0
//How to Reverse a String - Java Interview Question -1
    public static void main(String[] args) {

        String s = "Selenium";

        //System.out.println(s.reverse);
        //s.reverse()
        //no reverse function is not available
        //String is mutable function

        //1. using for loop
        int len = s.length(); //8
        String rev = "";

        for(int i = len-1; i >= 0; i--){
            rev = rev + s.charAt(i);
            //System.out.println(rev); //muineleS
        }
        System.out.println(rev);


        //2. using String buffer

        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

        //reverse is in string buffer
        //immutable class
    }
}
