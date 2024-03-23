package constructor;

public class Program1 {
int id=1;
String name="siya";
float marks=80.22f;

public void data() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(marks);
}
public static void main(String[] args) {
	Program1 p=new Program1();
	p.data();
}
}
