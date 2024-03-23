package collection2;

import java.util.LinkedList;

public class Linkedlistclass {
public static void main(String[] args) {
	
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("priya");
	ll.add("ram");
	ll.add("siya");
	
	System.out.println("After adding element"+ll);
	
	ll.add(1, "monu");
	System.out.println(ll);
	
	
	
}
}
