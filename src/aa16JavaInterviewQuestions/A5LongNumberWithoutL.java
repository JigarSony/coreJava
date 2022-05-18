package aa16JavaInterviewQuestions;
//https://www.youtube.com/watch?v=s1xu6bDKWK0&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=5
//Interview Question: Output when print a long number with L and without L suffix in #Java​?

public class A5LongNumberWithoutL {

    public static void main(String[] args) {

        //What will be the output when you use L and without L suffix?

        long longNumberWithoutL = 1000*60*60*24*365; //1471228928 because max limit int - 32 bit
        //31536000000 - Manually -- 36 bits
        System.out.println(longNumberWithoutL);

        long longNumberWithL = 1000*60*60*24*365L;
        System.out.println(longNumberWithL);
        //31536000000

        /**
         * output:
         * 1471228928
         * 31536000000
         */

    }
}
