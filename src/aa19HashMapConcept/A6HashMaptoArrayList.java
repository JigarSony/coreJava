package aa19HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class A6HashMaptoArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Google", 100);
		map1.put("Amazon", 200);
		map1.put("Walmart", 300);
		map1.put("Flipkart", 300);

		Iterator it = map1.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " - " + pairs.getValue());

			/*
			 * Google - 100 Walmart - 300 Flipkart - 300 Amazon - 200
			 */
		}
		
		//With Use of Lambda function
		map1.forEach((k,v) -> System.out.println("Keys: " + k + " -> " + "Values: " + v));
		/*
		 * Keys: Google -> Values: 100
		 * Keys: Walmart -> Values: 300
		 * Keys: Flipkart -> Values: 300
		 * Keys: Amazon -> Values: 200
		 */

		// convert hashMap keys into Arraylist
		List<String> companyName = new ArrayList<String>(map1.keySet());
		System.out.println(companyName);
		//[Google, Walmart, Flipkart, Amazon]
		for (String t : companyName) {
			System.out.println(t);

			/*
			 * Google Walmart Flipkart Amazon
			 */
		}
		
		// convert hashMap values into Arraylist
		List<Integer> empCountList = new ArrayList<Integer>(map1.values());
		System.out.println(empCountList);
		//[100, 300, 300, 200]
		for (Integer t : empCountList) {
			System.out.println(t);
			/*
			 * 100
			 * 300
			 * 300
			 * 200
			 */
		}
	}
}