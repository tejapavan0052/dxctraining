package practice;
class invok{
	public invok() {
		System.out.println("parent class");
	}
     public invok(int x) {
		System.out.println("parent args class");
	}
}
class vok extends invok{
	public vok() {
		super(50);
		System.out.println("child class");
		
	}
}
public class coninvok {

	public static void main(String[] args) {
		vok c=new vok();

	}

}
