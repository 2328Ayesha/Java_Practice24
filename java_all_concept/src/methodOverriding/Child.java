package methodOverriding;

public class Child extends Parent{

    public void bunglow() {
		
		System.out.println("child bunglow");
	}
   public void car() {
		
		System.out.println("child car");
	}
    
    
    public static void main(String[] args) {
    	Child  c=new Child();
    	c.bunglow();
    	c.car();
    	c.farm();
    	
	}
}
