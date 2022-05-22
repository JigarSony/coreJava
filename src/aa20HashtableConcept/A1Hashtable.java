package aa20HashtableConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class A1Hashtable {

	public static void main(String[] args) {
		/*
		 * HashTable - Synchronised - ThreadSafe - slow
		 * Similar to HashMap
		 * Stores the value Key-Value pair
		 * Key-->Object-->HashCode-->value
		 * HashCode - Java Provide someNumber 32 bit int signed Number
		 * store unique values only
		 * No null key and null values -> NullPointer Exception
		 */
		
		Hashtable h1 = new Hashtable();
		
		//put()
		h1.put(1, "Tom");
		h1.put(2, "Peter");
		h1.put(3, "Jerry");
		//h1.put(null,"ABC")
		//h1.put(4,null)
		
		//get()
		System.out.println(h1.get(1));
		//Tom
		
		//clone()
		//create a clone/shallow copy:
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		
		System.out.println("H1 " + h1);
		System.out.println("H2 " + h2);
		//H1 {3=Jerry, 2=Peter, 1=Tom} H2 {3=Jerry, 2=Peter, 1=Tom}
		
		//clear()
		h1.clear();
		
		System.out.println("H1 " + h1);
		System.out.println("H2 " + h2);
		//H1 {} H2 {3=Jerry, 2=Peter, 1=Tom}
		
		//contains()
		System.out.println(h2.contains("Tom"));
		System.out.println(h2.containsKey(3));
		System.out.println(h2.containsKey(8));
		System.out.println(h2.containsKey("ABC"));
		//true true false false
		
		Hashtable st = new Hashtable();
		st.put("A", "Hello");
		st.put("B", "How are you?");
		st.put("C", "Where are you?");
		
		//print all values from Hashtable using -- enumeration -- elements()
		Enumeration e  = st.elements();
		System.out.println("Print all values using enumeration");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//Print all values using enumeration Hello Where are you? How are you?
		
		
		//print all values from Hashtable using -- entrySet()
		Set s = st.entrySet();
		System.out.println("Print all values using entrySet");
		System.out.println(s);
		//Print all values using entrySet [A=Hello, C=Where are you?, B=How are you?]
		
		
		//equals()
		Hashtable st1 = new Hashtable();
		st1.put("A", "Hello");
		st1.put("B", "How are you?");
		st1.put("C", "Where are you?");
		
		if(st.equals(st1))
			System.out.println("Both are equals");
			//Both are equals
		
		//get the HashCode of Hashtable
		System.out.println("HashCode: " + st1.hashCode());
		//HashCode: -295560393
		
		//with genics
		Hashtable<String, String> htt = new Hashtable<String, String>();
	}
}