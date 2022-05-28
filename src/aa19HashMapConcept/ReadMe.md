# HashMap

```
Map is kind of collection in which we use to store values in form of key-value pair format
```

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/23.png?raw=true)

```
HashMap - is a class implements MapInterface
Extends AbstractMap
Contains unique element
stores value in form of Key and Value pair
It may have one Null key and multiple Null values
It maintains No Order/ No Indexes
It's non-synchronised(not 1 by 1) - means if hashMap used in Multi-threading environment then
Hence Performance increased
Hence not thread-safe
```
```
 Problem:
Fail-Fast Condition: (concurrent modification exceptions)
If multiple threads accessing same hash map at same time
One of the thread updated the value then other get affected (gets updated value)
```
## A1HashMap

```
package aa19HashMapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class A1HashMap {

	public static void main(String[] args) {
		/*
		 * HashMap - is a class implements MapInterface
		 * Extends AbstractMap
		 * 
		 * Contains unique element
		 * stores value in form of Key and Value pair
		 * 
		 * It may have one Null key and multiple Null values
		 * It maintains No Order/ No Indexes
		 * 
		 * It's non-synchronised(not 1 by 1) - means if hashMap used in Multi-threading environment then
		 * More than 1 thread can access same hashMap simultaneously 
		 * 
		 * Hence Performance increased
		 * 
		 * Hence not thread-safe
		 * 
		 * 
		 * Problem:
		 * Fail-Fast Condition: (concurrent modification exceptions)
		 * If multiple threads accessing same hash map at same time
		 * One of the thread updated the value then other get affected (gets updated value)
		 * 
		 */
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//put()
		hm.put(1, "Selenium");
		hm.put(2, "JUnit");
		hm.put(3, "TestNG");
		
		//get();
		System.out.println(hm.get(1));
		//Selenium
		
		System.out.println(hm.get(4));
		//null
		
		//to retrieve values
		//.entrySet()
		
		for(Entry e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			/*
			 * 1 Selenium
			 * 2 JUnit
			 * 3 TestNG
			 */
		}
		
		System.out.println(hm);
		//{1=Selenium, 2=JUnit, 3=TestNG}
		
		hm.put(4, "Cucumber");
		
		//.remove()
		hm.remove(3);
		
		System.out.println(hm);
		//{1=Selenium, 2=JUnit, 4=Cucumber}
		
		//Add Class objects in HashMap
		HashMap<Integer, A2Employee> emp = new HashMap<Integer, A2Employee>();
		
		A2Employee em1 = new A2Employee("Tom", 10, "Admin");
		A2Employee em2 = new A2Employee("Nick", 20, "QA");
		A2Employee em3 = new A2Employee("Harry", 30, "Dev");
		
		emp.put(1, em1);
		emp.put(2, em2);
		emp.put(3, em3);
		
		//traverse
		for(Entry<Integer, A2Employee> m : emp.entrySet()) {
			int key = m.getKey();
			A2Employee e = m.getValue();
			
			System.out.println("Employee " + key + " info ");
			System.out.println(e.name + " " + e.age + " " + e.dep);
			/*
			 * Employee 1 info 
			 * Tom 10 Admin
			 * Employee 2 info 
			 * Nick 20 QA
			 * Employee 3 info 
			 * Harry 30 Dev
			 */
		}
	}
}
```

## A2Employee

```
package aa19HashMapConcept;

public class A2Employee {
	
	String name;
	int age;
	String dep;
	
	public A2Employee(String name,int age, String dep) {
		this.name = name;
		this.age = age;
		this.dep = dep;
	}
}
```

## How HashMap internally Works

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/24.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/25.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/26.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/27.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/28.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/29.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/30.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/31.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/32.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/33.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/34.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/35.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/36.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/37.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/38.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/39.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/40.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/41.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/42.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/43.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/44.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/45.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/46.png?raw=true)

![alt text](https://imgur.com/uK1Cmsp)

## A3HowHashMapWorkInternally

```
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
```

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/47.png?raw=true)

## A4DifferentWaysofcreatingHashMap

[upcasting-and-downcasting](https://www.javatpoint.com/upcasting-and-downcasting-in-java)

[mutable-and-immutable](https://www.javatpoint.com/mutable-and-immutable-in-java)

```
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
```
