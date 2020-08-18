package sba.assesment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
public class DipShow {
	Map<String,List<Carzs>> carstore;
	public void displayCarsByShowroomname(String Showroomname)
	{
	List<Carzs> cars=carstore.get(Showroomname);
	for(Carzs car:cars){
	System.out.println(car);
	}

}
	public static void main(String[] args) {
		Carzs c1=new Carzs("Benz",1990);
		Carzs c2=new Carzs("Tata",1991);
		Carzs c3=new Carzs("Swift",1992);
		Carzs c4=new Carzs("Innova",1993);
		List<Carzs> cars=new ArrayList<Carzs>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
	    cars.add(c4);
	    Showroomz showroom=new Showroomz("Janatha Garage", 789, cars);
		    
		Carzs c5=new Carzs("Ferrari",1884);
	    Carzs c6=new Carzs("Fortuner",1885);
		Carzs c7=new Carzs("Scoda",1886);
		Carzs c8=new Carzs("Nissan",1888);

		
		List<Carzs> cars1=new ArrayList<Carzs>();
		cars1.add(c5);
		cars1.add(c6);
		cars1.add(c7);
		cars1.add(c8);
		Showroomz showroom1=new Showroomz("vendor cars", 678, cars1);
		DipShow s= new DipShow();
		s.carstore=new HashMap<String,List<Carzs>>();
		s.carstore.put(showroom.getShowroomname(), showroom.getCars());
		s.carstore.put(showroom1.getShowroomname(),showroom1.getCars());
		System.out.println("-------cars in janatha garage----------------------------------");

		s.displayCarsByShowroomname("Janatha Garage");
		System.out.println("-------cars in vendor cars----------------------------------");

		s.displayCarsByShowroomname("vendor cars");
		System.out.println("---------================task3_2==========---------------");
		System.out.println("----------a.manfacture year--------------------");
		
		Collections.sort(cars);

		for(Carzs sh:cars)
		{
		System.out.println(sh.getManyear());
		}
		for(Carzs sh:cars1)
		{
		System.out.println(sh.getManyear());
		}
		System.out.println("-----------b.carname---------------------");
		for(Carzs sh:cars)
		{
			System.out.println(sh.getCarname());

		}
		for(Carzs sh:cars1)
		{
			System.out.println(sh.getCarname());

		}
		System.out.println("-----------------------========task3_3===========================--------------------");
		System.out.println("-------------------showroom1---------------------");
		for(Carzs sh:cars)
		{
		System.out.println(sh.getManyear() + "-");
		System.out.println(sh.getCarname());
		}
		System.out.println("-------------------showroom2---------------------");

		for(Carzs sh:cars1)
		{	
		System.out.println(sh.getManyear() + "-");
		System.out.println(sh.getCarname());

		}		

		
	     

		     
}
}