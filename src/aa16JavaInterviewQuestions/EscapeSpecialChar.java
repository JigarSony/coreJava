package aa16JavaInterviewQuestions;
//HOW TO ESCAPE SPECIAL CHARACTERS IN JAVA? || PRINT STRINGS WITH DOUBLE QUOTES
//https://www.youtube.com/watch?v=Sp3I4IundmE

public class EscapeSpecialChar {
    public static void main(String[] args) {
        /**
         *  /"Hello"/
         *  /'Hello'/
         *  "Hello"
         *  I love "Java" "Programming" and "Driving"
         *  'I love "Java" "Programming" and "Driving"'
         */

        System.out.println("/\"Hello\"/");
        System.out.println("/'Hello'/");
        System.out.println("\"Hello\"");
        System.out.println("I love \"Java\" \"Programming\" and \"Driving\"");
        System.out.println("'I love \"Java\" \"Programming\" and \"Driving\"'");

        System.out.println(getXpath("Hello"));
    }

    /**
     * /"Hello"/
     * /'Hello'/
     * "Hello"
     * I love "Java" "Programming" and "Driving"
     * 'I love "Java" "Programming" and "Driving"'
     *
     * //input[@id='Hello']
     *
     * Escape Character \ back slash
     */

    public static String getXpath (String name){
        String xpath = "//input[@id='"+name+"']";
        return xpath;
    }

    /**
     * String xpath = "//input[@id='name']";
     * //input[@id='name']
     *
     * String xpath = "//input[@id='"+name+"']";
     * //input[@id='Hello']
     */
}
