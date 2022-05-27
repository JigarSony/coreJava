package aa19HashMapConcept;

import java.util.HashMap;

public class A3HowHashMapWorkInternally {

	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Nv", 100);
		marks.put("Mk", 200);
		marks.put("RP", 300);
		marks.put("Tom", 400);
		marks.put("Peter", 600);
		
		marks.put(null, 500);
		
		//hashing -> hashCode() --> hashing
		
		System.out.println(marks.get("Tom"));
		//hashCode of Tom ->23546
		//index = 15
		//.equals methods to check key Name
		//Tom
		//return the value
	}

}
