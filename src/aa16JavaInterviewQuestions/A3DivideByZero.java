package aa16JavaInterviewQuestions;
//https://www.youtube.com/watch?v=yyKCm6pXQy4&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=4
//Java Interview Question: What will be the output when you divide a number by zero?
public class A3DivideByZero {

    public static void main(String[] args) {
        /**
         * What will be the output when you divide a number by zero?
         * Number = Integer, Double, Float
         */

        //System.out.println(9/0);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        //System.out.println(0/0);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println(9.0/0);
        //Infinity

        System.out.println(12.55555d/0);
        //Infinity

        System.out.println(12.55f/0);
        //Infinity

        System.out.println(12/0.0);
        //Infinity

        System.out.println(12.0/0.0);
        //Infinity

        System.out.println(0.0/0);
        //NaN

        System.out.println(0.0/0.0);
        //NaN
    }

    /**
     * Infinity
     * Infinity
     * Infinity
     * Infinity
     * Infinity
     * NaN - Not a Number
     * NaN
     */

}
