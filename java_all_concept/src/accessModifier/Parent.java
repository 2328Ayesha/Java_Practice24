package accessModifier;
//all method run same class-private,default,protected,public
public class Parent {

	private void bunglow() {
		System.out.println("parent bunglow");
	}
	 void farm() {
		System.out.println("parent farm");
	}
	protected void jwellery() {
		System.out.println("parent jwellery");
	}
	public void car() {
		System.out.println("parent car");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.bunglow();
		p.farm();
		p.jwellery();
		p.car();
	}
	
}
