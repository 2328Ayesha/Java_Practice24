package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LoopArraylist {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("y");
		al.add("e");
		al.add("s");
		al.add("h");
		al.add("a");
		System.out.println(al);
		
		//for loop
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("*********************");
		
		//for each loop
		for( Object i:al) {
			System.out.println(i);
		}
		
		System.out.println("*********************");
		
		//Iterator 
	    Iterator it = al.iterator();
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    System.out.println("*********************");
	    
	    Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		System.out.println("*********************");
		
		
	}
}
