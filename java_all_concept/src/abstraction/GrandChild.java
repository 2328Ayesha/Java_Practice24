package abstraction;

public class GrandChild extends Child{

	
	public void method4() {
	
		System.out.println("method 4");
		
	}

	public static void main(String[] args) {
		GrandChild g=new GrandChild();
		g.method1();
		g.method2();
		g.method3();
		g.method4();
	}
}
