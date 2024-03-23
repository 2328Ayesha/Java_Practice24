package collection3;

import java.util.HashSet;
import java.util.Iterator;

public class LoopHs {

	public static void main(String[] args) {
		
	HashSet<String> cars = new HashSet<String>();       //homogeneious data
	
	cars.add("volvo");
	cars.add("bmw");
	cars.add("maruti");
	cars.add("ford");
	
	System.out.println("element of hashset :"+ cars);
	
	for(String each: cars) {
		System.out.println(each);
	}
	System.out.println("++++++++++++++++++++++");
	
	Iterator<String> ite = cars.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
}
}
