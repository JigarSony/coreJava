package aa16JavaInterviewQuestions;

//Interview Question: Will Static block be executed with final variable?
//https://www.youtube.com/watch?v=xmcHT8ztJXE&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=8

public class A8WillStaticblockbeexecutedwithfinalvariable {

    public static void main(String[] args) {
        //System.out.println(Main.x); //100

        //If we remove final from -- public static final int x = 100; --public static int x = 100;
        System.out.println(Main.x);
        /**
         * output:
         * Main -- class static block.
         * 100
         */
    }
}

class Main{
    public static int x = 100;

    static {
        System.out.println("Main -- class static block.");
    }
}

