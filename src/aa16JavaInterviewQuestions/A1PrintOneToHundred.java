package aa16JavaInterviewQuestions;

//https://www.youtube.com/watch?v=_BXSdPNFnX8

public class A1PrintOneToHundred {
    public static void main(String[] args) {

        /**
         * Output number from 1 to 100
         * Without using any numbers in your code
         */

        /*for(int i = 1; i <=100; i++){
            System.out.println(i);
        }*/ //can not use this

        //Solution :1

        int one = 'A'/'A'; //1
        String s1 = ".........."; //10

        //1;<=10*10;1++
        for (int i = one; i <= (s1.length() * s1.length()); i++){
            System.out.println(i);
        }

        //Solution:2
        //ascii value a=97...
        for(int i = one; i<='d';i++){
            System.out.println(i);
        }
    }
}
