package collection5;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList pq = new LinkedList ();
		
		pq.add(10);
		pq.add(20);
		pq.add(5);
		pq.add(40);
		pq.add(5);
		pq.add(40);
		pq.offer(70);
		pq.add("A");
		
		System.out.println(pq); 
		
		System.out.println("peek method to access element : "+pq.element()); 
		
		System.out.println("element method to access element : "+pq.peek()); 
		
		System.out.println("remove element from method : "+pq.remove());
		
		System.out.println("after poll method : "+pq.poll());
		
		Iterator ite = pq.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}
}
