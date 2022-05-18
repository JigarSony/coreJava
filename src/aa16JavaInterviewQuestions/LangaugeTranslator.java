package aa16JavaInterviewQuestions;
//Java Interview Question: Create a Language Translator & Auto Bots || Reflection In Java
//https://www.youtube.com/watch?v=H0KteLg7E7w

import java.lang.reflect.Field;

public class LangaugeTranslator {

    static {
        Field value = null;
        try {
            value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Jigar", value.get("Hola Jigar"));
            value.set("How are you?", value.get("Tame Kem 6o?"));
            value.set("All Good", value.get("Badhu Mazama"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello Jigar");
        System.out.println("How are you?");
        System.out.println("All Good");
    }
    /*
    Hola Jigar
    Tame Kem 6o?
    Badhu Mazama
    */

    /*
    If value.setAccessible(false);
    Hello Jigar
    How are you?
    All Good
     */
}

