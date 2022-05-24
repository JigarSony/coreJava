package aa17ArrayListConcept;
//https://www.youtube.com/watch?v=Lq_JCX6Vt6w&list=PLFGoYjJG_fqooGAq7UKpkXb8l4xjyEQUr&index=8

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A3ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("GOT");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. using Java 1.8 for each loop with lambda expression
		System.out.println("---forEach---");
		tvSeries.forEach(shows ->{
			System.out.println(shows);
			 //GOT Breaking Bad The Big Bang Theory Walking Dead Prison Break
		});
		
		//2. using Iterator
		System.out.println("---Iterator---");
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3. using Iterator and Java 8 forEach Remaining method
		System.out.println("---forEachRemaining---");
		it = tvSeries.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});
		
		//4. using forEachLoop
		System.out.println("---forEachLoop---");
		for(String show : tvSeries) {
			System.out.println(show);
		}
		
		//5. using forLoop with order/Index
		System.out.println("---using forLoop with order/Index---");
		for(int i = 0; i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. using listIterator() to traverse in both the directions
		System.out.println("---using listIterator() to traverse in both the directions---");
		ListIterator<String> li = tvSeries.listIterator(tvSeries.size());
		while(li.hasPrevious()) {
			String show = li.previous();
			System.out.println(show);
		}
	}

}
