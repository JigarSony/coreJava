package aa20HashtableConcept;

import java.util.Hashtable;

public class A2HowHashTableWorkInternally {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		
		marks.put("Hola", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Roy", 400);
		
		System.out.println(marks.get("Tom"));
		//200
		
		//Things which is not allowed and giving null pointer Exception
		
		/*
		 * In HashTable Null key and Null value both are not allowed
		 */
		
		//marks.put(null, 500);
		//System.out.println(marks.get(null));
		//Object.hashCode()" because "key" is null
		//marks.put("Zeta", null);
		//System.out.println(marks.get("Zeta"));
		//java.lang.NullPointerException
		
	}

}
