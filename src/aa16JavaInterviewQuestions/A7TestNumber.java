package aa16JavaInterviewQuestions;
//Interview Question : Compare Two Integer Numbers (Integer Caching) in #Java
//https://www.youtube.com/watch?v=9i_OwZwzUsA&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=7

public class A7TestNumber {

    public static void main(String[] args) {

        /**
         * Compare two Integer Number (Integer Caching)
         */

        //Integer caching range -128 to 127

        Integer num1 = 100;
        Integer num2 = 100;

        if (num1 == num2) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Both are not Equal");
        }
        //Both are Equal

        Integer num3 = 190;
        Integer num4 = 190;

        if (num3 == num4) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Both are not Equal");
        }
        //Both are not Equal
    }
}
