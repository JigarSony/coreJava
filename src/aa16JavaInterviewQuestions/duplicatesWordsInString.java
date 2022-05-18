package aa16JavaInterviewQuestions;

//https://www.youtube.com/watch?v=ooYQ7lm6Xxk
//Java Program to Count Number of Duplicate Words in Given String
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatesWordsInString {

    public static void main(String[] args) {

        //Hey java is java best language is java
        //java:3
        //is:2

        findDuplicateWordsInString("Hey java is java best language is java");
    }

    public static void findDuplicateWordsInString(String inputString){

        //split
        String words[] = inputString.split(" ");

        //character hash map
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        for (String word:words){
            if (wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);
            }
        }

        Set<String> wordInString = wordCount.keySet();

        for (String word:wordInString){
            if (wordCount.get(word)>1){
                System.out.println(word+" : "+ wordCount.get(word));
            }
        }
    }
}
