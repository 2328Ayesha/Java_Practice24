package collection5;
//only homogeneous data //classClassCastException
import java.util.PriorityQueue;

public class PriQueue {
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
	
    System.out.println(pq.element());  //head of the queue return
	System.out.println(pq.peek());     //head of the queue return
	
	//remove() element using poll() method
	System.out.println("remove element from queue : "+pq.remove());
	
	System.out.println("queue after poll method : "+pq.poll());

	
	
	
	
}
}
