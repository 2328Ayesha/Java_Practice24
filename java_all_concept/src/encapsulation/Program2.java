package encapsulation;

public class Program2 {

	private int a=10;
	private int b=20;
	
	public void Setmethod(int add,int add2) {
		a=add;
		b=add2;
	}
	public int Getmethod() {
		
		return a;
		
	}
    public int Getmethod2() {
		
		return b;
		
	}
public static void main(String[] args) {
	Program2 p=new Program2();
	p.Setmethod(10, 20);
	System.out.println(p.Getmethod());
	System.out.println(p.Getmethod2());
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
