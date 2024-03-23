package inheritance2;
class parentA{
	
	public void method() {
		
		System.out.println("parent class method");
	}
}
class childB extends parentA{
	
	 public void method2() {
		
		System.out.println("child class method");
	}
}
public class Multilevel2 extends childB{

	public void method3() {
		
		System.out.println("2 child class method");
	}
	
	
	
	public static void main(String[] args) {
		Multilevel2 m=new Multilevel2();
		m.method();
		m.method2();
		m.method3();
	}
}
