package collection5;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Iteratorclass {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(40);
		pq.add(5);
		pq.add(40);
		pq.offer(70);
		
		System.out.println(pq);
		 
	Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("******************************");
		
		for(Object each:pq) {
			System.out.println(each);
		}
		
		
		
	}
}
