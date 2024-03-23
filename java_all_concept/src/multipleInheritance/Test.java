package multipleInheritance;

public class Test implements Parent2,Parent1 {

	
	public void car() {
	System.out.println("car method");
		
	}

	
	public void bike() {
		System.out.println("bike method");
		
	}

	
	public void bunglow() {
		System.out.println("bunglow method");
		
	}

	
	public void farm() {
		
		System.out.println("farm method");
	}



	public void mobile() {
		System.out.println("mobile method");
		
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.bunglow();
		t.farm();
		t.bike();
		t.car();
		t.mobile();
	}
	
	

}
