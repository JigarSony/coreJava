package aa19HashMapConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A4DifferentWaysofcreatingHashMap {
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		marksMap.put("C", 300);
	}

	public static void main(String[] args) {
		
		
		//1. Using HashMap Class
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		/*
		 * We can also declare same thing with this
		 * HashMap<String, Integer> hm = new HashMap<>();
		 */
		
		//2. Using Map Interface
		Map<String, Integer> mp = new HashMap<>();
		//upcasting
		//https://www.javatpoint.com/upcasting-and-downcasting-in-java
		
		//3. using static way: static hashmap
		
		/*
		 * public static Map<String, Integer> marksMap;
		 * static {
		 * marksMap = new HashMap<>();
		 * marksMap.put("A", 100);
		 * marksMap.put("B", 200);
		 * marksMap.put("C", 300);
		 * }
		 */
		
		System.out.println(marksMap.get("A"));
		//100
		
		/*
		 *Mutable Immutable: 
		 *Mutable: you can add values after the declaration
		 *Immutable: you cannot add any values after the declaration
		 *
		 * https://www.javatpoint.com/mutable-and-immutable-in-java
		 */
		
		
		//4. ImmutableMap with only one single entry
		Map<String,Integer> map3 = Collections.singletonMap("Tom", 200);
		System.out.println(map3.get("Tom"));
		//200
		
		//map3.put("Lisa",300);
		/*
		 * Above line give an exceptions -- UnsupportedOperationException
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * at java.base/java.util.AbstractMap.put(AbstractMap.java:209)
		 * at aa19HashMapConcept.A4DifferentWaysofcreatingHashMap.main(A4DifferentWaysofcreatingHashMap.java:53)
		 */
		
		//5. Java JDK 1.8
		//ToMap()
		//creating one 2D Array of Strings using Stream and collecting in the form Map
		
		Map<String, String> map4 = Stream.of(new  String [] [] {
			{"Tom", "A Grade"},
			{"Peter", "B Grade"}
		}).collect(Collectors.toMap(data -> data[0],data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		//A Grade
		
		map4.put("Hary", "C Grade");
		System.out.println(map4.get("Hary"));
		//C Grade	
		
		//6. Simple Documentation Entry: MutableMap
		Map<String, String> map5 =  Stream.of(
				new AbstractMap.SimpleEntry<>("Tom", "Java"),
				new AbstractMap.SimpleEntry<>("Nick", "JavaScript"),
				new AbstractMap.SimpleEntry<>("Jack", "C++")
				).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		System.out.println(map5.get("Jack"));
		//C++
		
		map5.put("Hary", "C#");
		System.out.println(map4.get("Hary"));
		//C#	
		
		//7. JDK 1.9:
		//Empty Map:
		
		Map<String, String> emptymap = Map.of();
		
		/*
		 * This is EmptyMap
		 * If you add value like
		 * emptymap.put("AAA", "AAA");
		 * 
		 * and try to get like
		 * System.out.println(emptymap.get("AAA"));
		 * 
		 * Get an Exceptions-UnsupportedOperationException
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:127)
		 * at java.base/java.util.ImmutableCollections$AbstractImmutableMap.put(ImmutableCollections.java:907)
		 * at aa19HashMapConcept.A4DifferentWaysofcreatingHashMap.main(A4DifferentWaysofcreatingHashMap.java:99)
		 * 
		 */
		
		//8. JDK 1.9
		//Singleton Map
		Map<String, String> singletonMap =  Map.of("K1","v1");
		System.out.println(singletonMap.get("K1"));
		//v1
		
		/*
		 * If you going to add one more value
		 * 
		 * singletonMap.put("AAA", "AAA");
		 * System.out.println(singletonMap.get("AAA"));
		 * 
		 * 
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 * at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:127)
		 * at java.base/java.util.ImmutableCollections$AbstractImmutableMap.put(ImmutableCollections.java:907)
		 * at aa19HashMapConcept.A4DifferentWaysofcreatingHashMap.main(A4DifferentWaysofcreatingHashMap.java:126)
		 */
		
		//9.
		//MultiValue Map
		Map<String, String> multiMap =  Map.of("K1","v1","K2","v2","K3","v3","K4","v4");
		System.out.println(multiMap.get("K3"));
		//v3
		//limitation is we can add only 10 key-value pair only
		
		
		//10. Map.ofEntries
		//Immutable
		Map<String, String> map6 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("Tom", "Java"),
				new AbstractMap.SimpleEntry<>("Nick", "JavaScript"),
				new AbstractMap.SimpleEntry<>("Jack", "C++")
				);
		
		System.out.println(map6.get("Tom"));
		//Java
		
		/*
		 * If you going to add one more value
		 * 
		 * singletonMap.put("AAA", "AAA");
		 * System.out.println(singletonMap.get("AAA"));
		 * 
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 */
		
		//11. guava - api - Maven Project only
		//Map<String, String> map7 =  ImmutableMap.of("GoogleK", "GoogleV"...);
		//System.out.println(map7.get("GoogleK"));
		//Java
		
	}

}
