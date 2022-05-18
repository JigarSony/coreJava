package aa16JavaInterviewQuestions;

public class CommentExecution {

    //https://www.youtube.com/watch?v=iM1CvTDgYtA
    //Tricky Java Interview Question: Can We Execute Comments in Java? || Unicode carriage return
    //https://en.wikipedia.org/wiki/List_of_Unicode_characters

    public static void main(String[] args) {

        //hi this is comment (' \u000d System.out.println("Hello world");

        System.out.println("Hello Java");

        int i = 10;
        // \u000d i=20;
        System.out.println(i);
        System.out.println(\u000d);
        System.out.println("Hello");

        /*
        * Output:
        * Hello world
        * Hello Java
        * 20
        *
        * Hello
         */

        //\ u 0 0 0 d  behave as new line character
    }
}