package aa18LinkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class A1LinkList {

	public static void main(String[] args) {
		
		//![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/20.png?raw=true)
		
		/*
		 * LinkList: 
		 * It's Special collection/dynamic array
		 * 1. Actual Data 2. Reference Node
		 * Head - Pointing to first Node
		 * Null - Last node pointing to null
		 */
		
		//![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/21.png?raw=true)
		
		//![alt text](https://github.com/JigarSony/coreJava/blob/master/Screenshots/22.png?raw=true)
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add()
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		System.out.println(ll);
		//[A, B, C, D]
		
		//addFirst()
		ll.addFirst("A1");
		System.out.println(ll);
		//[A1, A, B, C, D]
		
		//addLast()
		ll.addLast("Z");
		System.out.println(ll);
		//[A1, A, B, C, D, Z]
		
		//get()
		System.out.println(ll.get(0));
		//A1
		
		//set()
		ll.set(0, "1A1");
		System.out.println(ll.get(0));
		//1A1
		
		//remove(), removeFirst(), removeLast()
		ll.remove("1A1");
		System.out.println(ll);
		//[A, B, C, D, Z]
		
		ll.remove(0);
		System.out.println(ll);
		//[B, C, D, Z]
		
		ll.removeFirst();
		System.out.println(ll);
		//[C, D, Z]
		
		ll.removeLast();
		System.out.println(ll);
		//[C, D]
		
		//how to print all values?
		//for loop
		//advance for loop
		//iterator
		//while loop
		
		//for loop
		System.out.println(">>> for loop");
		for(int i = 0; i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//advance for loop
		System.out.println(">>> advance for loop");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println(">>> iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println(">>> while loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
