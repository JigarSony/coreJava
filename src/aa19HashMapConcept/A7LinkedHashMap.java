package aa19HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class A7LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("1", "A");
		lhm.put("2", "B");
		lhm.put("3", "C");
		lhm.put("4", "D");
		
		System.out.println(lhm);
		//{1=A, 2=B, 3=C, 4=D}
		
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("1", "A");
		hm.put("22", "BB");
		hm.put("333", "CCC");
		hm.put("4", "D");
		
		System.out.println(hm);
		//{22=BB, 1=A, 333=CCC, 4=D}
	}

}
