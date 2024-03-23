package diamondIssueSolved;

public class Test implements Parent1,Parent2{

	
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
		Test t=new Test();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
	}

}
