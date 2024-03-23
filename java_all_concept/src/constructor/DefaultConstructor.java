package constructor;

public class DefaultConstructor {
	
int a;
byte b;
char c;
float d;
long e;
double f;
short g;
boolean h;

public void method() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
}
public static void main(String[] args) {
	DefaultConstructor d=new DefaultConstructor();
	d.method();
}
}
