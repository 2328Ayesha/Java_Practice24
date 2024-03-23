package variable;
//Global variable ---->Inside class but not in any method
                             //scope- can be used through out the class

//Local variable----->Inside class also inside a method / loop
                            //scope-only inside that block where it is declared


public class GlobalLocal {
	
       static int a=10;             //global
      

       public static void addition() {
    	   
    	   int b=20;                  //Local
    	   int sum=a+b;
    	   System.out.println(sum); 
       }

       public static void main(String[] args) {
    	   addition();
	}

       







}
