package aa16JavaInterviewQuestions;
//Interview Question: What is NaN - Not A Number? How is NaN defined in different languages?
//https://www.youtube.com/watch?v=Qzw8Lx9Cp1Y&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=4
public class A4NotANumber {

    public static void main(String[] args) {

        /** What is NaN - Not a Number
         * How is NaN defined in different Langauge
         * Java, C, C++, Ruby, Python, JavaScript
         */

        System.out.println(0.0/0.0);
        //NaN

        System.out.println(Math.sqrt(-1));
        //NaN

        System.out.println(Float.NaN == Float.NaN);
        //false

        System.out.println(Float.NaN != Float.NaN);
        //true

        //NaN is not define in C instead of giving some negative value
    }
}
