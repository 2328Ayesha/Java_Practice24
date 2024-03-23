package collection2;

import java.util.LinkedList;

public class LL2 {
	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("priya");
		ll1.add("ram");
		ll1.add("Jiya");
		
		System.out.println("1 collection elements "+ll1);
		
		System.out.println("*************************************************");
		
		LinkedList<String> ll2= new LinkedList<String>();
		ll2.add("sita");
		ll2.add("radha");
		ll2.add("rohit");
		 
		ll1.addAll(ll2);
		System.out.println("After adding collection2 to collection  1"+ll1);
		
		ll1.remove("priya");
		System.out.println("After removing element in collection 1 priya :"+ll1);
		
		ll2.remove(2);
		System.out.println(ll2);
		
		System.out.println("element at 0th position is : "+ll1.get(0));
		
		//replace jiya to ayesha 
		ll1.set(2, "ayesha");
		System.out.println("after adding ayesha"+ll1);
	}
}
