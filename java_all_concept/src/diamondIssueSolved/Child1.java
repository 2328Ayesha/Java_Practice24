package diamondIssueSolved;

public class Child1 implements P1,P2{

	
	public void phone() {
		
	System.out.println("phone parent 2");
		
	}

	
	public void flat() {
	
		System.out.println("flat parent 2");
	}


	public void farm() {
		
		System.out.println(" farm parent 1");
	}

	
	public void car() {
		
		System.out.println("car parent 1");
	}

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.phone();
		c.farm();
		c.flat();
		c.car();
	}
}
