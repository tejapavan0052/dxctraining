package collections;

public class StudentDemo {
	private String name;
	private int rollNo;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getRollNo() {
	return rollNo;
	}
	public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
	}

	public StudentDemo(String name, int rollNo) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	}


	public void dispStudent(){
	System.out.println(name+" "+rollNo);
	}

	@Override
	public String toString() {
	return "StudentDemo [name=" + name + ", rollNo=" + rollNo + "]";
	}


	
}
