package collection4;

import java.util.LinkedHashSet;

public class LinkedHashset {
public static void main(String[] args) {
	
	LinkedHashSet<Integer> llhs = new LinkedHashSet<Integer>();          //homogeneous data
	
	llhs.add(1);
	llhs.add(2);
	llhs.add(3);
	llhs.add(4);
	llhs.add(5);
	llhs.add(5);  //duplicate not allow
	
	
	System.out.println(llhs);
	
	
	
	
	
	
}
}
