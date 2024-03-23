package inheritance2;
class parentS{
	
	public void method1() {
		
		System.out.println("parent class method");
	}
}

class childS extends parentS{
	
	public void method2() {
		
		System.out.println("child 1");
	}
}
public class Hierarchical extends parentS{

	public void method3() {
		
		System.out.println("child 2");
	}
	
	
	public static void main(String[] args) {
		Hierarchical h=new Hierarchical();
		h.method1();
		h.method3();
		
		childS c=new childS();
		c.method1();
		c.method2();
	}
}
