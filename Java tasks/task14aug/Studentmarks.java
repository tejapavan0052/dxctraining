package task14aug;

public class Studentmarks {
	String name;
	int rollno;
	int sub1;
	int sub2;
	int sub3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public Studentmarks(String name, int rollno, int marks, int sub1, int sub2, int sub3) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public void dispmarks() {
		System.out.println(name+" "+rollno+" "+sub1+" "+sub2+" "+sub3);
	}
		@Override
		public String toString() {
		return "Studentmarks [name=" + name + ", rollno=" + rollno + ",sub1="+ sub1+",sub2="+sub2+",sub3="+sub3+"]";
		}
		
		
	}
	


