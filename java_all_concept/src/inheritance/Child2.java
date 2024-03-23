package inheritance;

class Father{
	
	public void method1() {
		System.out.println("method 1");
	}
}
class Child4  extends Father{
	
	public void method2() {
		System.out.println("method 2");
	}
	
}
public class Child2 extends Father{
	
	public void method3() {
		System.out.println("method 3");
	}
public static void main(String[] args) {
	Child4 c=new Child4();
	c.method1();
	c.method2();
	
	Child2 c1=new Child2();
	c1.method1();
	c1.method3();
	
	
}
}
