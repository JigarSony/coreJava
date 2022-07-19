package aa19HashMapConcept;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class A8TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new  TreeMap<Integer, String>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(300, "Nikole");
		map.put(10000, "Alebert");
		
		System.out.println(map);
		//{300=Nikole, 1000=Tom, 2000=Peter, 10000=Alebert}
		
		map.forEach((k,v) -> System.out.println(" Key = " + k + " Value = " +v));
		/*
		 *  Key = 300 Value = Nikole
		 *  Key = 1000 Value = Tom
		 *  Key = 2000 Value = Peter
		 *  Key = 10000 Value = Alebert
		 */
		
		System.out.println(map.firstKey());
		//300
		
		System.out.println(map.lastKey());
		//10000
		
		Set<Integer> lessthan3k = map.headMap(3000).keySet();
		
		System.out.println(lessthan3k);
		//[300, 1000, 2000]
		
		Set<Integer> greaterthan3K = map.tailMap(3000).keySet();
		System.out.println(greaterthan3K);
		//[10000]
		
		
		//Sorting happens on Keys
		
		TreeMap<String, Integer> userMap = new TreeMap<>();
		
		userMap.put("Zebra", 100);
		userMap.put("Happy", 400);
		userMap.put("Larry", 1200);
		userMap.put("Alebert", 900);
		userMap.put("Suzuki", 1000);
		
		userMap.forEach((k,v) -> System.out.println(" Key = "+k + " Value = "+v));
		
		/**
		 *  Key = Alebert Value = 900
		 *  Key = Happy Value = 400
		 *  Key = Larry Value = 1200
		 *  Key = Suzuki Value = 1000
		 *  Key = Zebra Value = 100
		 */
		
		//if you want in reverse order `Comparator.reverseOrder()`
		
		TreeMap<String, Integer> userMap1 = new TreeMap<>(Comparator.reverseOrder());
		
		userMap1.put("Zebra", 100);
		userMap1.put("Happy", 400);
		userMap1.put("Larry", 1200);
		userMap1.put("Alebert", 900);
		userMap1.put("Suzuki", 1000);
		
		userMap1.forEach((k,v) -> System.out.println(" Key = "+k + " Value = "+v));
		
		/**
		 * Key = Zebra Value = 100
		 * Key = Suzuki Value = 1000
		 * Key = Larry Value = 1200
		 * Key = Happy Value = 400
		 * Key = Alebert Value = 900
		 */
	}

}
