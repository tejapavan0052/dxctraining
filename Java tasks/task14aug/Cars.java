package task14aug;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Cars {
	public static void main(String[] args) {


		List<Showroom> show=new ArrayList<Showroom>();

		Showroom s1=new Showroom(1995, " Hundai ","syns and co ");
		Showroom s2=new Showroom(1996, " Honda ","cars limited");
		Showroom s3=new Showroom(1997, " Benz ","benzandco");
		Showroom s4=new Showroom(1998, " Swift ","xyzshowroom");
		Showroom s5=new Showroom(1999, " Tata ","sandc");

		show.add(s1);
		show.add(s2);
		show.add(s3);
		show.add(s4);
		show.add(s5);


		Collections.sort(show);

		for(Showroom sh:show)
		{
		System.out.println(sh.getM_year() + ",");
		System.out.println(sh.getC_name() + ", ");
		System.out.println(sh.getS_name() + ", ");
		
		

		}

		}

		}


