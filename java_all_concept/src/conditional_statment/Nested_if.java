package conditional_statment;
//dependent condition (if under another if)
public class Nested_if {
public static void main(String[] args) {
	String un="taimur";
	String pwd="3122";
	
	if(un=="taimur")
	{
        System.out.println("user name is correct");
        
		if(pwd=="3122")
		{
			System.out.println("password is correct");
			System.out.println("login is successful");
		}	
		else 
		{
			System.out.println("password is wrong");	
			
		}
	
}
	else
	{
	 System.out.println("username is wrong");
	}
	
}
}
