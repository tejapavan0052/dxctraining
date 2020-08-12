
public class employee {
	String empname;
	int empid;
	int phnumber;
	int age;
	String email;
	
	void init() {
		empname="pavan";
		empid=6789;
		phnumber=234567890;
		age=24;
		email="ertyui@gmail.com";
	}
	void disp() {
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(phnumber);
		System.out.println(age);
		System.out.println(email);
	}
	
	public static void main(String[] args) {
		employee t=new employee();
		t.init();
		t.disp();

	}

}
