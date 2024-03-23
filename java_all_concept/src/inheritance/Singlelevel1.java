package inheritance;
class parent{
	
	public void method1() {
		System.out.println("parent class");
	}
}
public class Singlelevel1 extends parent {
	
   public void method2() {
	   System.out.println("child class");
}
   public static void main(String[] args) {
	   Singlelevel1 s=new Singlelevel1();
	   s.method1();
	   s.method2();

}
}
