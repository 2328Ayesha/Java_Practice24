package inheritance;
class Dog{
	
	public void method1() {
		System.out.println("dag is my fev pet");
	}
}
class Cat extends Dog{

	public void method2() {
		System.out.println("cat is my fev pet");
	}
}
public class Animal extends Cat{

	public void method3() {
		System.out.println("Lion is animal");
	}
	
	public static void main(String[] args) {
		Animal  a=new Animal();
		a.method1();
		a.method2();
		a.method3();
	}
}
