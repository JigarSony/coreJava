# Java Collections

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/12.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/13.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/14.png?raw=true)

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/15.png?raw=true)

# ArrayList

```
All these collection comes from java.util packages 
ArrayList: Has a dynamic size
Where you can Increase by adding 
And Decrease by Removing
ArrayList, LinkedList and Vectors implements List interface
And This is not sequential
Can Accept Duplicate values also
Array have fixed size where as ArrayList can grow dynamically
You can access and insert any value in any index
```

## A1arrayListDemo

```
package aa13Collections1;

import java.util.ArrayList;

public class A1arrayListDemo {

	public static void main(String[] args) {
		
		/*
		 * All these collection comes from java.util packages 
		 * 
		 * ArrayList: Has a dynamic size
		 * Where you can Increase by adding 
		 * And Decrease by Removing
		 * 
		 * ArrayList, LinkedList and Vectors implements List interface
		 * 
		 * And This is not sequential
		 * Can Accept Duplicate values also
		 * 
		 * Array have fixed size where as ArrayList can grow dynamically
		 * You can access and insert any value in any index
		 */
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Hello");
		a.add("Java");
		
		System.out.println(a);
		//[Hello, Java]
		
		a.add(0, "Jack");
		System.out.println(a);
		//[Jack, Hello, Java]
		
		//a.remove(1);
		System.out.println(a);
		//[Jack, Java]
		
		//a.remove("Java");
		System.out.println(a);
		//[Jack]
		
		System.out.println(a.get(2));
		//Java
		
		System.out.println(a.contains("Testing"));
		//false
		
		System.out.println(a.contains("Hello"));
		//true
		
		System.out.println(a.indexOf("Java"));
		//2
		
		System.out.println(a.isEmpty());
		//false
		
		System.out.println(a.size());
		//3
		
		a.add("Java");
		System.out.println(a);
		//[Jack, Hello, Java, Java]
		
		System.out.println(a.indexOf("Java"));
		//2
	}
}
```

---

# Set

```
HashSet, TreeSet, LinkedHashSet implements Set Interface
Does not accepts duplicates value
There is no guarantee that element stores in sequential order...Random Order
```

```
Iterator - Interface
If you want to iterate through each and every string present in hash set
There is an interface called Iterator
Which helps you to traverse through each and every object present in set
```

## A2hashSet

```
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
```
---

# HashMap and Hash Table

![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/16.png?raw=true)

```
HashMap - Map Collection
Stored Value in Key-Value Combination
Key is kind of reference of any value
HashMap is not threadSafe
It'a not threadSafe Means: Multiple program can use single hashMap
And Made it Non-Synchronised
HashMap stores/contains Null value also
```

## A3hashMap

```
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
```

## A4hashTable

```
package aa13Collections1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A4hashTable {

	public static void main(String[] args) {
		
		/*
		 * HashTable - Map Collection same like HashMap
		 * Stored Value in Key-Value Combination
		 * 
		 * Key is kind of reference of any value
		 */
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
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
		//HashTable passing thro Set
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			//here separating key and value from sets
		}
	}
}
```

---

## A5IntQue

```
package aa13Collections1;

import java.util.ArrayList;

public class A5IntQue {

	public static void main(String[] args) {
		
		//find the unique number in the array
		
		int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};
		
		//4-3, 5-3, 6-2, 9-1
		
		//Empty ArrayList  push unique then search for other
		//counter also
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0;i<a.length;i++) 
		{
			int k=0;
			
			if(!al.contains(a[i])) 
			{
				al.add(a[i]);
				k++;
				for(int j = i+1;j<a.length;j++) 
				{
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+ " - times - "+k);
				
				if (k==1) {
					System.out.println(a[i] + " is a unique Number ");
				}
			}
			
		}
		
	}

}
```
