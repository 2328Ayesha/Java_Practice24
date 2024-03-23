package collection6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LoopHashmap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> language = new HashMap<>();
		
		language.put(1, "Java");
		language.put(2, "selenium");
		language.put(3, "python");
		System.out.println("Hashmap"+language);
		
		
		System.out.println(language.keySet());
		
		for(int i:language.keySet()) {
			System.out.println(i);
		}
	
		Iterator<Integer> ite = language.keySet().iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		 System.out.println("**************entry set for each output**********************");
		 
		 for(Entry<Integer, String> i:language.entrySet()) {
			 System.out.println(i.getKey()+" "+i.getValue());
		 }
		 
		 System.out.println("*************entry set iterator output************************");
		 
		Iterator<Entry<Integer, String>> itrt = language.entrySet().iterator();
		
		while( itrt .hasNext()) {
			System.out.println( itrt .next());
		}
	}
}
