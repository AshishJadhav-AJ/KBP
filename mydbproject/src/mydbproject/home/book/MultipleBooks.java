package mydbproject.home.book;

import java.util.ArrayList;

import mydbproject.home.book.db.Database;

public class MultipleBooks {
	private ArrayList<Book> list;
	
	public MultipleBooks() {
		this.list = new ArrayList<Book>();
	}
	
	public void setBook(Book bk) {
		list.add(bk);
	}
	
	public void saveData() {
		Database.save(list);
	}
}
