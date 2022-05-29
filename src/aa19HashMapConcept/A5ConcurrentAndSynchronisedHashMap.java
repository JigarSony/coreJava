package aa19HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class A5ConcurrentAndSynchronisedHashMap {
	
	/*
	 * HashMap v/s HashTable v/s SynchronisedHashMap v/s ConcurrentHashMap
	 * 
	 * HashMap is not synchronised
	 */

	public static void main(String[] args) {
		
		//SynchronisedMap Method in collections Class:
		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("1", "Tom");
		map1.put("2", "Jery");
		map1.put("3", "Mouse");
		
		//how to created synchronisedMap
		Map<String,String> syncMap =  Collections.synchronizedMap(map1);
		
		System.out.println(syncMap);
		//{1=Tom, 2=Jery, 3=Mouse}
		
		//concurrentHashmap
		ConcurrentHashMap<String,String> conMap = new ConcurrentHashMap<>();
		conMap.put("A", "Tom");
		conMap.put("B", "Jery");
		conMap.put("C", "Mouse");
		
		System.out.println(conMap.get("A"));
		//Tom
		
		//Concurrent HashMap: Doesn't throws any ConcurrentModificationException
	}

}
