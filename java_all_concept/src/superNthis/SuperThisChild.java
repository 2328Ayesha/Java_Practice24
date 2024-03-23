package superNthis;

public class SuperThisChild extends SuperThisParent{

    int a=100;                    //global
	int b=200;
	
	public void addition() {
		int a=1000;
		int b=2000;
		int sum=a+this.a+super.a;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		SuperThisChild s=new SuperThisChild();	
		s.addition() ;
	}
}
