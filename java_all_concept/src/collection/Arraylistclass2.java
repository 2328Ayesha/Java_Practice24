package collection;

import java.util.ArrayList;

public class Arraylistclass2 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add("a");
	al.add("y");
	al.add("e");
	al.add("s");
	al.add("h");
	al.add("a");
	System.out.println(al);
	
	ArrayList<String> al2 = new ArrayList<String>();
	System.out.println("before adding ="+al2);
	
	al2.addAll(al);
	System.out.println("after adding ="+al2);
	
	al2.removeAll(al);
	System.out.println("after removing ="+al2);
	
	
	
}
}
