package aa16JavaInterviewQuestions;
//print this: (byte) + (char) - (int) + (long) - 1?
//https://www.youtube.com/watch?v=7K1nyyuHqes&t=2s

public class PrintThis {

    public static void main(String[] args) {
        int i = (byte) + (char) - (int) + (long) - 1;
        System.out.println(i);

        int j = (int) + (long) - 1;
        System.out.println(j);

        int k = (char) - (int) + (long) - 1;
        System.out.println(k);
    }

    /**
     * 1
     * -1
     * 1
     * Execution Start from Right to Left
     */
}
