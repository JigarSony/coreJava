package aa17ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class A1ArrayList {
	
	/*
	 * What is ArrayList: ArrayList is Dynamic Array
	 * int a [] = new int[3]; - This is Static Array
	 * If you try to retrieve 4th or 5th value it'll give array Index out of bound exceptions
	 * Problem - Size is fixed
	 * 
	 * ArrayList:
	 * 1. Can contains duplicate values
	 * 2. Maintained Insertion order
	 * 3. Synchronised
	 * 4. ThreadSafe
	 * 5. Allows Random access to fetch the element because it stores the values on basis of indexes
	 */

	public static void main(String[] args) {
		
		int a [] = new int[3];
		//static array
		
		ArrayList ar = new ArrayList();
		//non generic arrayList object
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		//3
		//.size() - method used for get size of array
		
		ar.add(40);//3
		ar.add(50);//4
		
		System.out.println(ar.size());
		//5
		
		ar.add(50);
		//duplicate value is also allowed
		
		/*
		 * Allows
		 * ar.add(12.30);
		 * ar.add("aaa");
		 * ar.add('a');
		 * ar.add(true);
		 */
		
		System.out.println(ar.get(3));
		//40
		//to get value from Index
		
		//Print All values:
		//1. for loop
		//2. Iterator
		
		//for loop
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}// 40 10 20 30 40 50 50
		
		Iterator itt =  ar.iterator();
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}
			
		
		//non generic vs. generic
		//We're not defining which dataType - nonGeneric
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		//this is called generic
		//needs to use wrapper class in <>
		//<Integer> - This is called generic in Java
		//Supported after JDK 1.5
		
		ar1.add(10);
		//ar1.add("Hello"); - gives error 
		
		ArrayList<String> ar12 = new ArrayList<String>();
		
		/*
		 * If data type is not defined we can do like this
		 * ArrayList<E> ar123 = new ArrayList<E>();
		 */
		
		//Inside this ArrayList Object We can store different class/userDefine class object
		
		//Employee class A2Employee class object
		
		A2Employee em1 = new A2Employee("EM1", 27, "QA");
		A2Employee em2 = new A2Employee("EM2", 28, "Dev");
		A2Employee em3 = new A2Employee("EM3", 29, "Admin");
		
		//create ArrayList
		
		ArrayList<A2Employee> aep = new ArrayList<A2Employee>();
		
		aep.add(em1);
		aep.add(em2);
		aep.add(em3);
		
		//iterator to traverse
		Iterator<A2Employee> it = aep.iterator();
		 while (it.hasNext()) {
			A2Employee a2Employee = (A2Employee) it.next();
			System.out.println(a2Employee.name);
			System.out.println(a2Employee.age);
			System.out.println(a2Employee.dep);
		}
		
		 //addAll(): add two arrayList objects
		 ArrayList<String> ar5 = new ArrayList<String>();
		 ar5.add("Selenium");
		 ar5.add("QTP");
		 ar5.add("JMeter");
		 
		 ArrayList<String> ar6 = new ArrayList<String>();
		 ar6.add("JS");
		 ar6.add("C#");
		 ar6.add("python");
		 ar6.add("Java");
		 
		 
		 ar5.addAll(ar6);
		 
		 for(int i = 0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i));
			 /*
			  * Selenium
			  * QTP
			  * JMeter
			  * JS
			  * C#
			  * python
			  * Java
			  */
		 }
		 
		 //removeAll() - remove ArrayList Object
		 ar5.removeAll(ar6);
		 for(int i = 0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i));
			 /*
			  * Selenium
			  * QTP
			  * JMeter
			  */
		 }
		 
		 //retainAll() - common element 
		 
		 ArrayList<String> ar7 = new ArrayList<String>();
		 ar7.add("Selenium");
		 ar7.add("QTP");
		 ar7.add("JMeter");
		 
		 ArrayList<String> ar8 = new ArrayList<String>();
		 ar8.add("JS");
		 ar8.add("C#");
		 ar8.add("python");
		 ar8.add("JMeter");
		 
		 ar7.retainAll(ar8);
		 for(int i = 0; i<ar7.size(); i++) {
			 System.out.println(ar7.get(i));
			 //JMeter
		 }
	}
}
