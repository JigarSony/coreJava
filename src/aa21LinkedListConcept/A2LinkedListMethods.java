package aa21LinkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//Video - 19
public class A2LinkedListMethods {

	public static void main(String[] args) {
		
		/**
		 * LL is a default class in Java
		 * It can be used as List, Stack and Queue
		 * It allows NULL Entry
		 * Contain Duplicate Element
		 * Dynamic collections
		 * Hence Insertion Deletion Easily Implemented
		 * It's not Synchronised and thread-safe
		 * In LinkedList manipulation is fast because no needs to shifting - Pointer works :)
		 */
		
		/**
		 * LL constructors:
		 * LinkedList();
		 * LinkedList(Collection c);
		 */
		
		LinkedList<String> names = new LinkedList<String>();
		
		//to get size of linked list
		System.out.println(names.size());
		//0
		
		//add value
		names.add("Hi");//0
		names.add("Hello");//1
		
		System.out.println(names.size());
		//2
		
		//to print linked list
		System.out.println(names);
		//[Hi, Hello]
		
		//to get value of linked list
		System.out.println(names.get(0));
		//Hi
		
		System.out.println(names.get(1));
		//Hello
		
		//print using iterator
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//Hi
			//Hello
		}
		
		//to add value
		names.add("Ram");//2
		System.out.println(names);
		//[Hi, Hello, Ram]
				
		//add value at specific position
		names.add(3, "Shyam");//3
		System.out.println(names);
		//[Hi, Hello, Ram, Shyam]
		
		names.add(2, "Shiva");//2
		System.out.println(names);
		//[Hi, Hello, Shiva, Ram, Shyam]
		
		
		//****** Another Linked List
		LinkedList<String> users = new LinkedList<String>();
		users.add("Tom");
		users.add("Peter");
		
		System.out.println(users);
		//[Tom, Peter]
		
		//If you want to add one linked list to another use addAll()
		names.addAll(users);
		System.out.println(names);
		//[Hi, Hello, Shiva, Ram, Shyam, Tom, Peter]
		
		//to add value at first position
		names.addFirst("Kamala");
		System.out.println(names);
		//[Kamala, Hi, Hello, Shiva, Ram, Shyam, Tom, Peter]
		
		//to add value at last position
		names.addLast("Vimala");
		System.out.println(names);
		//[Kamala, Hi, Hello, Shiva, Ram, Shyam, Tom, Peter, Vimala]
		
		//to remove value from specific position
		names.remove(2);
		System.out.println(names);
		//[Kamala, Hi, Shiva, Ram, Shyam, Tom, Peter, Vimala]
		
		//to remove linked list - added linked list
		//names.removeAll(users);
		//System.out.println(names);
		//[Kamala, Hi, Shiva, Ram, Shyam, Vimala]
		
		//to remove first element from linked list
		names.removeFirst();
		
		//to remove last element from linked list
		names.removeLast();
		System.out.println(names);
		//[Hi, Shiva, Ram, Shyam]
		
		//to clear all values from linked list
		//names.clear();
		System.out.println(names);
		//[]
		
		
		//**** Another Linked List
		LinkedList<String> lang = new LinkedList<String>();
		
		System.out.println(lang.size());
		//0
		
		lang.add("Java");
		lang.add("JavaScript");
		lang.add("phython");
		lang.add("Ruby");
		
		System.out.println(lang.size());
		//4
		
		//to reverse linked list - descendingIterator()
		Iterator<String> itr = lang.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			/**
			 * Ruby
			 * phython
			 * JavaScript
			 * Java
			 */
		}
		
		//Collections
		
		//Sort
		
		Collections.sort(lang);
		System.out.println(lang);
		//[Java, JavaScript, Ruby, phython]
	}

}
