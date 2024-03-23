package variable;

public class Sample {

	int a=10;
	int b=20;
	
	public static void method() {
		int a=100;
		int b=200;
		int add=a+b;
		System.out.println(add);
	}
	
	public static void main(String[] args) {
		method();
	
	}
}
