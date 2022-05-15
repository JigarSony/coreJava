package aa13Collections1;
//Video-58
import java.util.HashSet;
import java.util.Iterator;

public class A2hashSet {

	public static void main(String[] args) {
		/*
		 * HashSet, TreeSet, LinkedHashSet implements Set Interface
		 * Does not accepts duplicates value
		 * 
		 * There is no guarantee that element stores in sequential order...Random Order
		 * 
		 */
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		
		System.out.println(hs);
		//[USA, UK, India]
		hs.add("India");
		
		System.out.println(hs);
		//[USA, UK, India]
		
		hs.remove("UK");
		System.out.println(hs);
		//[USA, India]
		
		System.out.println(hs.isEmpty());
		//false
		
		System.out.println(hs.size());
		//2
		
		//Video-59
		/*
		 * Iterator - Interface
		 * If you want to iterate through each and every string present in hash set
		 * There is an interface called Iterator
		 * Which helps you to traverse through each and every object present in set
		 */
		
		hs.add("He");
		hs.add("She");
		
		Iterator<String> it = hs.iterator();
		//System.out.println(it.next());//She
		//System.out.println(it.next());//USA
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
			/*
			 * She
			 * USA
			 * He
			 * India
			 */
		}
	}

}
