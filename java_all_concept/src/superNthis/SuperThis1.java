package superNthis;

public class SuperThis1 {

	int a;
	int b;
	
	public void setValues(int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	
	public static void main(String[] args) {
		SuperThis1 s=new SuperThis1();
		s.setValues(10, 20);
		System.out.println(s.a);
		System.out.println(s.b);
		
	}
	
	}
