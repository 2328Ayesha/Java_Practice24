package interfacePackage;

public class C1 implements I1,I2{


	public void method3() {
	
		System.out.println("method 3");
		
	}
	public void method4() {
		
		System.out.println("method 4");
		
	}
	public void method1() {
		
		System.out.println("method 1");
		
	}
	public void method2() {
		
		System.out.println("method 2");
		
	}

	public static void main(String[] args) {
		C1 c=new C1();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
	}
	
}
