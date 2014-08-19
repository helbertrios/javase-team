package github.com.helbertrios.demo.javase.collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;

class Book extends Object {

	private String isbn;

	public Book(String isbn) {
		this.isbn = isbn;
	}

	public boolean equals(Object o) {
		return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
	}
	
	
	public int hashCode() {
		return this.isbn.hashCode();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}

class BookStore {
	Map<Book, Integer> map = new TreeMap<Book, Integer>();

	public BookStore() {
		Book b = new Book("A111");
		map.put(b, 10);
		System.out.println("OK");
		b = new Book("B222");
		map.put(b, 5);
	}

	Integer getNumberOfCopies(Book b) {
		System.out.println(b.getIsbn());
		return map.get(b);
	}

	public static void main(String[] args) {
		BookStore bs = new BookStore();
		
		Book b = new Book("A111");
		
		System.out.println(bs.getNumberOfCopies(b));
	}
}
