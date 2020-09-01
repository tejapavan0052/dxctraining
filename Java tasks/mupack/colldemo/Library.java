package com.mupack.colldemo;
import java.util.List;

public class Library {
	private String name;
	private int libraryId;
	String librarian;

	List<Book> books;


	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getLibraryId() {
	return libraryId;
	}
	public void setLibraryId(int libraryId) {
	this.libraryId = libraryId;
	}
	public String getLibrarian() {
	return librarian;
	}
	public void setLibrarian(String librarian) {
	this.librarian = librarian;
	}




	public Library(String name, int libraryId, String librarian, List<Book> books) {
	super();
	this.name = name;
	this.libraryId = libraryId;
	this.librarian = librarian;
	this.books = books;
	}
	public List<Book> getBooks() {
	return books;
	}
	public void setBooks(List<Book> books) {
	this.books = books;
	}
	@Override
	public String toString() {
	return "Library [name=" + name + ", libraryId=" + libraryId + ", librarian=" + librarian + ", books=" + books
	+ "]";
	}
	public Library() {

	}


	}



