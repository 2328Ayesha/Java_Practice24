package superNthis;

public class Child extends Parent{

	int a=100;
	int b=200;
	int d=40;
	
	public void addition() {
		int a=1000;
		int b=2000;
		int e=50;
		int sum=a+this.a;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.addition(); 
	}
}
