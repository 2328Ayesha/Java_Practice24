package collection6;

import java.util.HashMap;

public class HashMapProgram {
public static void main(String[] args) {
	
	HashMap<Integer, String> language = new HashMap<>();
	
	language.put(1, "Java");
	language.put(2, "selenium");
	language.put(3, "python");
	
	System.out.println("Hashmap"+language);
	
	String value=language.get(1);
	System.out.println(value);
	
	System.out.println(language.keySet());     //return type-> set of integer
	
	System.out.println(language.values());    //return type-> collection of string
	
	System.out.println(language.entrySet());    //return type->set collection

	language.replace(3, "c++");
	System.out.println(language);
	
	System.out.println("containsKey() 2 :- "+language.containsKey(4));  //particular value in present or not
	
	System.out.println("containsKey() 2 :- "+language.containsValue("python"));  //particular value in present or not
	
	System.out.println("size of hasmap :-"+language.size());
	
	System.out.println("is hashmap empty :-"+language.isEmpty());

	HashMap<Integer, String> language2 = new HashMap<>();	
	
	 language2.put(4, "c");
	 language2.put(5, "ruby");
	 language2.put(6, "c#");
	 
	 language.putAll(language2);
	 
	 System.out.println( language);
	
	
}
}
