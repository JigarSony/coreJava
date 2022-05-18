package aa16JavaInterviewQuestions;
//Tricky Interview Question: What is the MIN_Value of Double and Float in #Java
//https://www.youtube.com/watch?v=ch5GIhxlxnM&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=6
public class A6DoubleMinValue {

    public static void main(String[] args) {

        /**
         * What is the value of double MIN_VALUE?
         * Which one is bigger -> double MIN_VALUE or 0.0d?
         * Which one is bigger -> double MIN_VALUE or NEGATIVE_INFINITY?
         */

        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308 is a +ve Number
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Float.MIN_VALUE); //1.4E-45 is a +ve Number

        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Float.MAX_VALUE); //3.4028235E38

        System.out.println(Math.min(Double.MIN_VALUE,0.0d)); //0.0
        System.out.println(Math.min(Integer.MIN_VALUE,0)); //-2147483648

        System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY)); //-Infinity
    }
}
