package method1;
import method2.Static3;
public class Static1 {
	
	public static void method1() {
		
		System.out.println("method 1");
	}
	
	public static void method2() {
		
		System.out.println("method 2");
	}
	
public static void main(String[] args) {
	
	method1();
	method2() ;
	Static2.method3();
	Static3.method4();
}
}
