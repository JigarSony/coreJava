package aa13Collections1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A3hashMap {

	public static void main(String[] args) {
		
		/*
		 * HashMap - Map Collection
		 * Stored Value in Key-Value Combination
		 * 
		 * Key is kind of reference of any value
		 * 
		 * HashMap is not threadSafe
		 * it'a not threadSafe Means: Multiple program can use single hashMap
		 * And Made it Non-Synchronised
		 * HashMap stores/contains Null value also
		 */
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0,"Hello");
		hm.put(1, "How Are you");
		hm.put(2, "What are you doing");
		hm.put(3, "I am fine");
		
		System.out.println(hm.get(2));
		//What are you doing
		
		System.out.println(hm.get(42));
		//null
		
		System.out.println(hm.remove(42));
		//null
		
		Set sn = hm.entrySet();
		//HashMap passing thro Set
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			//here separating key and value from sets
		}
	}
}
