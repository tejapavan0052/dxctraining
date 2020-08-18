package sba.assesment2;

import java.util.Comparator;

public class Carzs implements Comparator<Carzs>,Comparable<Carzs>{
	int manyear;
	String carname;
	public int getManyear() {
		return manyear;
	}
	public void setManyear(int manyear) {
		this.manyear = manyear;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Carzs(String carname, int manyear) {
		super();
		this.manyear = manyear;
		this.carname = carname;
	}
	@Override
	public String toString() {
	return "Carzs [carname=" + carname + ", manyear=" + manyear + "]";
	}
	

	public Carzs(){}
	@Override
	public int compareTo(Carzs o1) {
	return  (this.carname).compareTo(o1.carname) ; 
	}
	@Override
	public int compare(Carzs o1, Carzs o2) {
		return o1.manyear - this.manyear;
	}
}
