package inheritance2;

class parent{
	
	public void method() {
		
		System.out.println("parent class method");
	}
}
public class Single1 extends parent{
	
	public void method2() {
		
		System.out.println("child class method");
	}
	
	
	
	public static void main(String[] args) {
		Single1 s=new Single1();
		s.method();
		s.method2();
		
	}

}
