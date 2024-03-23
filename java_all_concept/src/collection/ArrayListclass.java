package collection;
//avaialble by default 10data 
import java.util.ArrayList;

public class ArrayListclass {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();     //hetrogeneous data
	
	//ArrayList<String> cars=new ArrayList<String>();
	
	al.add("java");
	al.add(66);
	al.add('H');
	al.add(true);
	al.add(12.4);
	
	System.out.println(al);
	
	System.out.println("size of arraylist = "+al.size());
	System.out.println("access elemnt = "+al.get(0));
	al.set(0, "python");
	System.out.println("After set method = "+al);
	al.isEmpty();
	System.out.println("empty list ="+al);
	System.out.println("size of list ="+al.size());
	al.add(1, 99);
	System.out.println("after insert method ="+ al);
	System.out.println(al.contains("python"));
	System.out.println(al.isEmpty());
	
	
}
}
