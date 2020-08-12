package taskday3;

class Customer
{
	int empid;
	String cname;
	double phnumber;
	String email;
	int age;
	int pin;
public Customer(int empid,String cname,double phnumber,String email,int age,int pin) {
this.empid=empid;
this.cname=cname;
this.phnumber=phnumber;
this.age=age;
this.pin=pin;

}
	

void disp()
{
	System.out.println(empid);
	System.out.println(cname);
	System.out.println(phnumber);
	System.out.println(email);
	System.out.println(age);
	System.out.println(pin);
	
	
}
}

public class t6customer {
	

	public static void main(String[] args) {
		Customer customer=new Customer(121,"raj",78943,"hdwlrDU@gmail.com",25,89055);
		Customer customer1=new Customer(122,"ram",78944,"hdwldDU@gmail.com",26,890353);
		Customer customer2=new Customer(123,"raju",789443,"hdwfflDU@gmail.com",24,89035);
		Customer customer3=new Customer(124,"rajesh",7894443,"hdssdwlDU@gmail.com",23,8953);
		Customer customer4=new Customer(125,"rajan",7894443,"hdwlDUdd@gmail.com",22,895);
		
		customer.disp();
		customer1.disp();
		customer2.disp();
		customer3.disp();
		customer4.disp();
		

	}

}
