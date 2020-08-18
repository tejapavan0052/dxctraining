package task14aug;

public class StudentDemo1 {
	 String name;
     int rollNo;
     String team;
	

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



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public StudentDemo1(String name, int rollNo, String team) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.team = team;
	}



	public void dispStudent(){
	System.out.println(name+" "+rollNo+" "+team);
	}

	@Override
	public String toString() {
	return "StudentDemo1 [name=" + name + ", rollNo=" + rollNo + ",team=" + team+"]";
	}


	
}
