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
