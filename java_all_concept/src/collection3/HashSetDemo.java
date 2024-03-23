package collection3;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	//HashSet hs = new HashSet();   //hetrogeneious data 
	
	HashSet<String> cars = new HashSet<String>();       //homogeneious data
	
	cars.add("volvo");
	cars.add("bmw");
	cars.add("maruti");
	cars.add("ford");
	
	System.out.println("element of hashset :"+ cars);
	
	HashSet<String> cars2 = new HashSet<String>();
	
	cars2.add("hundai");
	cars2.add("toyota");
	
	cars2.addAll(cars);
	System.out.println("element of hashset cars after addAll methods"+cars2);
	
	cars2.remove("ford");
	System.out.println("elements of hashset cars after remove methods"+cars2);
	
	System.out.println(cars2.contains("ford"));
	
	System.out.println(cars.containsAll(cars2));
	
	System.out.println(cars.isEmpty());
	
	System.out.println(cars.size());
	
}
}
