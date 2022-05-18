package aa16JavaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicateCharacters {
//How to Print count of duplicate characters from String?
//https://www.youtube.com/watch?v=UaRbZqAsoco
    public static void main(String[] args) {

        printDuplicateCharacters(null);
        printDuplicateCharacters("");
        printDuplicateCharacters("j");
        printDuplicateCharacters("javataja");

    }

    public static void printDuplicateCharacters(String str){

        if (str == null){
            System.out.println("Null String");
            return;
        }

        if (str.isEmpty()){
            System.out.println("Empty String");
            return;
        }

        if (str.length()==1){
            System.out.println("Single Character String");
            return;
        }

        char words [] = str.toCharArray();//java
        System.out.println(words);
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        System.out.println(charMap);

        for (Character ch:words){
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
                //System.out.println("if");
                //System.out.println(charMap);
            }
            else {
                charMap.put(ch, 1);
                //System.out.println("else");
                //System.out.println(charMap);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
            for (Map.Entry<Character, Integer> entry: entrySet){
                if (entry.getValue() > 1){
                    System.out.println(entry.getKey() +":"+entry.getValue());
                }
        }

    }
}
