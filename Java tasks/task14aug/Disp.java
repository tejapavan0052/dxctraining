package task14aug;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;


public class Disp {

	public static void main(String[] args) {
		HashSet<Book> hs=new HashSet<>();

		Book B1 =new Book(12345,"maths","raj");
		Book B2 =new Book(12346,"social","raju");
		Book B3 =new Book(12347,"science","rajesh");
		Book B4 =new Book(12348,"physics","ramu");
		Book B5 =new Book(12349,"java","ramesh");
		

		hs.add(B1);
		hs.add(B2);
		hs.add(B3);
		hs.add(B4);
		hs.add(B5);

		System.out.println(hs);


		Iterator<Book> itr=hs.iterator();

		itr.next().dispStudent();

		while(itr.hasNext())
		{
		itr.next().dispStudent();
		}

	}

}
