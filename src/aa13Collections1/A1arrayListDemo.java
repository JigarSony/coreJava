package aa13Collections1;
//Video-55, 56
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