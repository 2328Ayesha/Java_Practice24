package casting;
//without inheritance upcasting is not possible
public class Upcasting {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.bunglow();
		p.farm();
		
		System.out.println();
		
		 Child c=new  Child();
		 c.bunglow();
		 c.farm();
		 c.car();
		 
		 System.out.println();
		 
		 Parent pc=new Child();
		 pc.bunglow();
		 pc.farm();
	//	 pc.jwellery();
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
