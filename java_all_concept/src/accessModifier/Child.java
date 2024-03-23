package accessModifier;
//
public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Parent p=new Parent();
//  	p.bunglow();
		p.farm();
		p.jwellery();
		p.car();
	
	   Child c=new Child();
	   c.farm();
	   c.jwellery();
	   c.car();
	
}
}