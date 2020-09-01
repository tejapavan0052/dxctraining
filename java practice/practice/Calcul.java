package practice;
class cul{
	int x=10;
	public cul() {
		System.out.println("p cons");
	}
	public cul(int x) {
		System.out.println("*p args cons");
		
	}	
}
class cal extends cul{
	int x=50;
	public cal() {
	super(10);
	}
	void abc(){
	System.out.println("val of x = "+super.x);
	System.out.println("val of x="+this.x);
	}
}
public class Calcul {
	public static void main(String[] args) {
		cal sc=new cal();

		sc.abc();
}
}