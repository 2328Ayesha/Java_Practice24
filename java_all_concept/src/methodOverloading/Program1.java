package methodOverloading;

public class Program1 {

	public void addition() {
		
		System.out.println("method 1");
	}
    public void addition(int a) {
		
		System.out.println("method 2");
	}
    public void addition(int a, int b) {
	
	System.out.println("method 3");
   
    }
    public void addition(double a, long b) {
	
	System.out.println("method 4");
    }
    
	
    public static void main(String[] args) {
    	Program1 p=new Program1();
    	p.addition();
    	p.addition(10);
    	p.addition(10, 20);
    	p.addition(10.0, 2000);
	}
}
