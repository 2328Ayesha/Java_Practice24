package conditional_statment;
//asending and decending order maintain and only 1 condition is true
public class Else_if2 {
public static void main(String[] args) {
	
	int money=3000;
	
	if(money>=2000){
		
		System.out.println("I can travel with flight");
	}
	
	else if(money>=1000){
		
		System.out.println("I can travel with bus");
	}
	
    else if(money>=200){
		
		System.out.println("I can travel with train");
	}
	
    else{
    	
    	System.out.println("I can not travel");
    }
	
	
	
	
	
}
}
