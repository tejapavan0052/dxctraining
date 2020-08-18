package sba.assesment2;
import java.util.List;
public class Showroomz {
	 String Showroomname;
	 int address;
	 List<Carzs> cars;
	public String getShowroomname() {
		return Showroomname;
	}
	public void setShowroomname(String showroomname) {
		Showroomname = showroomname;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public List<Carzs> getCars() {
		return cars;
	}
	public void setCars(List<Carzs> cars) {
		this.cars = cars;
	}
	public Showroomz(String showroomname, int address, List<Carzs> cars) {
		super();
		Showroomname = showroomname;
		this.address = address;
		this.cars = cars;
	}
	@Override
	public String toString() {
	return "Showroomz [Showroomname=" + Showroomname + ", address=" + address + ", cars=" + cars + "]";
	}
	
	
}
