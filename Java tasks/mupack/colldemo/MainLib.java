package com.mupack.colldemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainLib {
	public static void main(String[] args) {

		Book book1=new Book(2222,"Hary porter","j.k rowlin");
		Book book2=new Book(2233,"Road To Success","my passion");
		Book book3=new Book(2244,"Road to Failure","My x");


		List<Book> books=new Vector<Book>();

		books.add(book1);
		books.add(book2);
		books.add(book3);


		Library library=new Library("M.G Library", 101, "John", books);

		System.out.println(library);

		}

		
}
