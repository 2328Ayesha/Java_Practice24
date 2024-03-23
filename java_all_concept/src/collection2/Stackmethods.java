package collection2;
//push pop peek
import java.util.LinkedList;

public class Stackmethods {
	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();

		cars.add("volvo");
		cars.add("BMW");
		cars.add("ford");
		System.out.println("Before push method: "+cars);
		
		cars.push("Thar");
		System.out.println("After push method :"+cars);
		
		System.out.println("pop operations : "+cars.pop());
		
		System.out.println("After pop method list contains :"+cars);
		
		System.out.println("peek()"+cars.peek());
		System.out.println("list contains after peek() method: "+cars);
		
		System.out.println("peekfirst()"+cars.peekFirst());
		System.out.println("list contains after peekFirst() method: "+cars);
		
		System.out.println("peeklast()"+cars.peekLast());
		System.out.println("list contains after peeklast() method: "+cars);
		
		
	}
}
