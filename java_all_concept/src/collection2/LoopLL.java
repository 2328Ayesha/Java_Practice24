package collection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LoopLL {
public static void main(String[] args) {
	
	LinkedList<String> cars = new LinkedList<String>();
	cars.add("volvo");
	cars.add("BMW");
	cars.add("ford");
	
	for(int i=0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}
	System.out.println("*************++++++++++++++++++*******************");
	
	for(String each:cars) {
		System.out.println(each);
		
	}
	System.out.println("*************++++++++++++++++++*******************");
	
	Iterator it=cars.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	System.out.println(cars.isEmpty());
	
	Collections.sort(cars);
	System.out.println(cars);
	
	Collections.shuffle(cars);
	System.out.println(cars);
	
	
	
	
	
}
}
