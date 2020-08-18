package task14aug;

public class Book {
	long isbn;
	String title;
	String author;
	

	public long getIsbn() {
		return isbn;
	}


	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Book(long isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public void dispStudent() {
		System.out.println(isbn+" "+title+" "+author);
	}
		@Override
		public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ",author="+ author+"]";
		}
		
	}



