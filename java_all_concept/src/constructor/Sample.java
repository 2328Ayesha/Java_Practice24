package constructor;
//all value provide for default constructor
public class Sample {

	int a;
	boolean b;
	char c;
	float d;
	short e;
	public void method() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.method();
	}
}
