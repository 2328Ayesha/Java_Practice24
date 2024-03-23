package polymorphism;

public class Child extends Parent{

	public void car() {
		System.out.println("child car");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.bunglow();
		c.car();
	}
}
