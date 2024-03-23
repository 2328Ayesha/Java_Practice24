package casting;
//creating the object of child class with the help of parent class reference.
//we are only call those method which are belongs to both classes.
//we are not able to bike method bcoz is available in child class.

public class Test1 {
public static void main(String[] args) {
	
	 Parent1 pc=new Child1();
	 pc.bunglow();
	 pc.farm();      //child farm always latest code run
	 pc.jwellery();
	 
	
	

	
}
}
