package inheritance;

public class Childclass extends Parentclass{

	public void bike() {
		System.out.println("child bike");
	}
	public static void main(String[] args) {
		Childclass c=new Childclass();
		c.bike();
		c.bunglow();
		c.car();
		
	}
}
