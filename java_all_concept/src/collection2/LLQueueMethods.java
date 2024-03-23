package collection2;

import java.util.LinkedList;

public class LLQueueMethods {
public static void main(String[] args) {
	
	LinkedList<String> cars = new LinkedList<String>();

	cars.add("volvo");
	cars.add("BMW");
	cars.add("ford");
	System.out.println("before addfirst method: "+cars);
	
	cars.addFirst("scoda");
	System.out.println("After addfirst method: "+cars);
	
	cars.addLast("maruti");
	System.out.println("After addfirst method: "+cars);
	
	cars.removeLast();
	System.out.println(cars);
	
	System.out.println("getfirst method :"+cars.getFirst());
	System.out.println("getfirst method :"+cars.getLast());
	
}
}
