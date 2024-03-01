package mydbproject.home.book;

import java.util.Scanner;

public class Operations {
	
	
	static Scanner sc = new Scanner(System.in);
	static MultipleBooks mb = new MultipleBooks();
	public static  void setBooks() {
		int ch = 1;
		while(ch==1) {
		Book bk = new Book();
		System.out.println("Enter book id");
		int id= sc.nextInt();
		System.out.println("Enter book name");
		String name= sc.next();
		System.out.println("Enter book Author");
		String author= sc.next();
		bk.setBookName(name);
		bk.setBookId(id);
		bk.setAuthor(author);
		mb.setBook(bk);
		System.out.println("Press 1 for add more books\nPress 2 for save book");
		ch = sc.nextInt();
		if(ch==2) {
			
			mb.saveData();
			
		}
		
		}
		
		
	}
}
