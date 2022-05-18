package aa16JavaInterviewQuestions;

//https://www.youtube.com/watch?v=xuD2C37Xbe4

public class A2PrintHelloWorld {
    public static void main(String[] args) {
        //Print Hello World without any semi colon (;)
        //System.out.println("Hello World"); - can not use this

        //Solution:1
        if(System.out.printf("Hello World" + "\n") == null){

        }

        //Solution:2
        if(System.out.append("Hello World" + "\n") == null){

        }

        //Solution:3
        if(System.out.append("Hello World" +"\n").equals(null) ){

        }

        //Solution:4
        for(int i=0;i<1;System.out.append("Hello World")){
            i++;
        }
    }
}
