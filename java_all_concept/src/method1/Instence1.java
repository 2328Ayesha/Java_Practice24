package method1;
import method2.Instance3;

public class Instence1 {

	public void method1() {
		
		System.out.println("method 1");
	}

	
	
	public static void main(String[] args) {
		Instence1 im=new Instence1();
		im.method1();
		
		Instence2 im2=new Instence2();
		im2.method2();
		
		Instance3 im3=new Instance3();
		im3.method3();
	}
}
