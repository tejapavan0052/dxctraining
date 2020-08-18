package task14aug;
import java.util.*;

import java.util.Comparator;
    public class Showroom implements Comparator<Showroom>,Comparable<Showroom>{
	int m_year;
	String c_name;
	String s_name;
	private Object title;
	public int getM_year() {
		return m_year;
	}
	public void setM_year(int m_year) {
		this.m_year = m_year;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Showroom(int m_year, String c_name, String s_name) {
		super();
		this.m_year = m_year;
		this.c_name = c_name;
		this.s_name = s_name;
	}
	@Override
	public String toString() {
	return "Showroom [m_year=" + m_year + ", c_name=" + c_name + ", s_name=" + s_name + "]";
	}
	public Showroom(){}
	@Override
	public int compareTo(Showroom d) {
	return  (this.s_name).compareTo(d.s_name) ; 
	}
	public int compare(Showroom d1) {
	return  (this.c_name).compareTo(d1.c_name);
	}
	public int compare(Showroom d,Showroom d2,Showroom d1) {
	return d.m_year - this.m_year;
	}
	@Override
	public int compare(Showroom arg0, Showroom arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
	 
	 
	

	
	
