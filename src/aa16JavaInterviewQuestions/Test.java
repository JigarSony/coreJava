package aa16JavaInterviewQuestions;

public class Test {

//    int test_a;
//    int test_b;
//
//    Test(int a,int b){
//        test_a =a;
//        test_b=b;
//    }
    public static void main(String[] args) {
//        Test test = new Test();
//        System.out.println(test.test_a+" "+test.test_a);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
    /**
     * output:
     * false
     * true
     */
}
