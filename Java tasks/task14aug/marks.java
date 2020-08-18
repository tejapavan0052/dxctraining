package task14aug;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;


public class marks {
	public static void main(String[] args) {
		HashSet<Studentmarks> hs=new HashSet<>();

		Studentmarks B1 =new Studentmarks("raj",1,50,60,70, 0);
		Studentmarks B2 =new Studentmarks("rajqu",2,50,60,70, 0);
		Studentmarks B3 =new Studentmarks("rajesh",3,50,60,70, 0);
		Studentmarks B4 =new Studentmarks("ramu",4,50,60,70, 0);


		hs.add(B1);
		hs.add(B2);
		hs.add(B3);
		hs.add(B4);

		System.out.println(hs);
		Iterator<Studentmarks> itr=hs.iterator();

		itr.next().dispmarks();

		while(itr.hasNext())
		{
		itr.next().dispmarks();
		}

	}
}



	


