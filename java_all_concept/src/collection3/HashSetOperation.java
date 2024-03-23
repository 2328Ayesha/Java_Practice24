package collection3;

import java.util.HashSet;

public class HashSetOperation {
public static void main(String[] args) {
	
	HashSet<Integer> setA = new HashSet<Integer>();
	setA.add(0);
	setA.add(2);
	setA.add(4);
	setA.add(6);
	setA.add(8);
	
	HashSet<Integer> setB = new HashSet<Integer>();
	setB.add(1);
	setB.add(2);
	setB.add(3);
	setB.add(4);
	setB.add(5);
	
	setB.addAll(setA);
	System.out.println("Union is :"+setB);
	
	setB.retainAll(setA);
	System.out.println("Intersection is :"+setB);
	
	setA.removeAll(setB);
	System.out.println("Diff is :"+setA);
	
	
	
	System.out.println(setB.containsAll(setA));

	
}
}
