package github.com.helbertrios.demo.javase.collection.map.hasmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapSemHascode {

	public static void main(String[] args) {

		Map<Book, Integer> map = new HashMap<Book, Integer>();
		map.put(new Book("A111"), 10);
		map.put(new Book("a2"), 5);
		map.get(new Book("A111"));
		System.out.println("OK1");
		
		Map<Integer, Book> map2 = new HashMap<Integer, Book>();
		map2.put(10, new Book("A111"));
		map2.put(10, new Book("a2"));
		System.out.println("OK2");
	}
}

class Book {
	private String isbn;

	public Book(String nome) {
		this.isbn = nome;
	}

	public boolean equals(Object o) {
		return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
	}
}